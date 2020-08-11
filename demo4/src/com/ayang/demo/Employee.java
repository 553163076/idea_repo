package com.ayang.demo;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:26 2020/8/5
 * @Modified By:
 */
public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "name:" + getName() + ",age:" + getAge() + ",salary:" + getSalary();
    }
}
