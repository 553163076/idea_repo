package com.ayang.demo;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:30 2020/8/5
 * @Modified By:
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo(){
        return "name:" + getName() + ",age:" + getAge() + ",salary:" + getSalary() + ",bonus:"+getBonus();
    }
}
