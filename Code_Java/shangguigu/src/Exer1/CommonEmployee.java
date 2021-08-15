package Exer1;

public class CommonEmployee extends Employee {

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("work on factory");
    }
}
