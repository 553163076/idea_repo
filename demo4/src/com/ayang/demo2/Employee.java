package com.ayang.demo2;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 15:40 2020/8/5
 * @Modified By:
 */
public abstract class Employee {
    private int number;
    private String name;
    private MyDate birthday;

    //    构造器
    public Employee() {
    }

    public Employee(int number, String name, int year, int month, int day) {
        this.number = number;
        this.name = name;
        this.birthday = new MyDate(year, month, day);
    }

    public Employee(int number, String name, MyDate birthday) {
        this.number = number;
        this.name = name;
        this.birthday = birthday;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "编号：" + number +
                ", 名字:" + name +
                ", 生日:" + birthday.toDateString();
    }

    //  构造器
    public abstract double earnings();

}
