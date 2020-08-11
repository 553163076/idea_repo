package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:57 2020/8/6
 * @Modified By:
 */
public class Programmer extends Employee {
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
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
        return super.toString() +
                "\t\t程序员\t\t " + getStatus() +
                "\t\t\t\t\t\t\t    " + equipment.getDescription();
    }
}
