package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:11 2020/8/6
 * @Modified By:
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;

    }

    @Override
    public String toString() {
        return getString() + "\t\t设计师\t\t " +getStatus() +"\t\t"+ bonus +"\t\t\t\t    "+ getEquipment().getDescription();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
