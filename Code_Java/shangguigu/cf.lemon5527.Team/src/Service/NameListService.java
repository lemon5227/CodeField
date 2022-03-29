package Service;

import Domain.Employee;
import Domain.Equipment;
import Domain.*;
import static Service.Data.*;

/**
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关造作Employee[]的方法
 */
public class NameListService {

    private Employee[] employees;

    /**
     * 给employees及数组元素进行初始化
     */
    public NameListService(){
        //根据项目提供的Data类构建相应大小的employees数组
        //再根据Data类中的数据构建不同的对象，包括Employee，Programmer，Designer和Architect对象，以及相关联的Equipment子类的
        //对象存于数组中
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取Employee的四个基本信息

            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);


            Equipment equipment;
            double bonus;
            int stock;


            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Progarmmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age, salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    /**
     * @Description 返回所有员工
     * @return
     */
    public Employee[] getAllEmployee() {
        return employees;
    }

    /**
     * @Description 获取指定id的员工对象
     * @param id
     * @return
     * @throws TeamException
     */
    public Employee getEmployee(int id) throws TeamException{
        for(int i=0; i<employees.length; i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
    /**
     * @Description 获取第index个员工的设备
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(EQIPMENTS[index][0]);
        switch (type){
            case PC://21
                return new PC(EQIPMENTS[index][1],EQIPMENTS[index][2]);
            case NOTEBOOK://22
                return new NoteBook(EQIPMENTS[index][1],EQIPMENTS[index][2]);
            case PRINTER://23
                return new Painter(EQIPMENTS[index][1],EQIPMENTS[index][2]);
        }
        return null;
    }
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
