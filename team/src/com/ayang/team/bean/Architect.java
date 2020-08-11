package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:13 2020/8/6
 * @Modified By:
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    @Override
    public String toString() {
        return getString() + "\t\t架构师\t\t " + getStatus() +"\t\t"+ getBonus() +"\t\t "+getStock()+"\t\t"+getEquipment().getDescription();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }
}
