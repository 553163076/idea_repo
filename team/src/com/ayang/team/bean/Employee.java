package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:52 2020/8/6
 * @Modified By:
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public String getString(){
        return id + "\t\t " + name+"\t\t " + age + "\t\t   " + salary;
    }

    @Override
    public String toString() {
        return getString();
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

