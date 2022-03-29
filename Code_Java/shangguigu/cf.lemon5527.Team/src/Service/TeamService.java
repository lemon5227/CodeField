package Service;

import Domain.Architect;
import Domain.Designer;
import Domain.Employee;
import Domain.Progarmmer;

/**
 * @Description 关于开发团队的管理：添加，删除
 */
public class TeamService {

	private static int counter = 1; //给memberID赋值使用
	private final int MAX_MEMBER = 5; //限制开发团队的人数
	private Progarmmer[] team = new Progarmmer[MAX_MEMBER]; //保存开发团队的成员
	private int total = 0; //记录开发团队中实际的人数

	public TeamService() {
	}

	/**
	 * @Description 获取开发团队中的所以成员
	 * @return
	 */
	public Progarmmer[] getTeam(){
		Progarmmer[] team = new Progarmmer[total];
		for(int i=0; i<team.length; i++){
			team[i] = this.team[i];
		}

 		return team;
	}

	/**
	 * @Description 将指定的员工添加到开发团队中
	 * @param e
	 */
	public void addMember(Employee e) throws TeamException{
		//成员已满，无法添加
		if(total >= MAX_MEMBER){
			throw new TeamException("成员已满，无法添加");
		}
		//该成员不是开发人员，无法添加
		if(!(e instanceof Progarmmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		//该员工已经存在团队中
		if(isExist(e)){
			throw new TeamException("该员工已经存在团队中");
		}
		//该员工正在休假，无法添加
		Progarmmer p = (Progarmmer) e; //一定不会出现类型转换异常
		if("BUSY".equals(p.getStatus().getNAME()))//if(p.getStatus().getNAME().equals("BUSY"))
			 {
			throw new TeamException("该员已经是某团队成员，无法添加");
		}else if("VOCATION".equals(p.getStatus().getNAME())){
			throw new TeamException("该员工正在休假，无法添加");
		}
		//团队中至多只能用一名架构师
			//首先获取team已有的架构师，程序员，设计师人数
			int numOfArch = 0,numOfDes = 0,numOfPro =0;
		for(int i=0;i<total;i++){
			if(team[i] instanceof Architect){
				numOfArch++;
			}else if(team[i] instanceof Designer){
				numOfDes++;
			}else if(team[i] instanceof Progarmmer){
				numOfPro++;
			}

			if(p instanceof Architect){
				if(numOfArch >=1){
					throw new TeamException("团队中至多只能用一名架构师");
				}
			}else if(p instanceof Designer){
				if(numOfDes >=2){
					throw new TeamException("团队中至多只能用两名设计师");
				}
			}else if(p instanceof Progarmmer){
				if(numOfPro >=3){
					throw new TeamException("团队中至多只能用三名程序员");
				}
			}
		}

		//将p添加到现有的team
		team[total++] = p;
		//p的属性赋值
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);


	}

	/**
	 * @Description 判断指定的员工是否存在现有的开发团队中
	 * @param e
	 * @return
	 */
	private boolean isExist(Employee e) {
		for(int i=0; i<total;i++){
			if(team[i].getId() == e.getId()){
				return true;
			}
		}
		return false;
	}

	/**
	 * @Description 从团队中删除成员
	 * @param memberId
	 */
	public void removeMember(int memberId) throws TeamException {
		int i=0;
		for(i=0; i<total;i++){
			if(team[i].getMemberId() == memberId){
				team[i].setStatus(Status.FREE);
				break;
			}
		}

		if(i == total){
			throw new TeamException("未找到指定ID的员工，请重新输入");
		}

		for(int j =i+1;j<total;j++){
			team[j-1] = team[j];
		}

		team[total-1] = null;
		total--;

	}
}
