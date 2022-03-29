public class User implements Comparable{
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	//按照姓名从大到小排列
	@Override
	public int compareTo(Object o) {
		if(o instanceof User){
			User u = (User)o;
			int compare = this.name.compareTo(u.name);
			if(compare != 0){
				return compare;
			}else{
				return Integer.compare(this.age,u.age);
			}
		}else {
			throw new RuntimeException("输入的类型不匹配");
		}
	}
}
