package Domain;

import Service.Status;

public class Progarmmer extends Employee{
    private int memberId; //开发团队中的id
    private Status status = Status.FREE; //
    private Equipment equipment;

    public Progarmmer() {
    }

    public Progarmmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetail() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    public String getDetailForTeam() {
        return getMemberId()+"/"+getId()+'\t'+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
    }
}
