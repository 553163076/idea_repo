package com.ayang.demo2;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 16:14 2020/8/5
 * @Modified By:
 */
public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public HourlyEmployee(int hours, double wage) {
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee(int number, String name, int year, int month, int day, int hours, double wage) {
        super(number, name, year, month, day);
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee(int number, String name, MyDate birthday, int hours, double wage) {
        super(number, name, birthday);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return wage*hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",工作了" + hours +
                "小时, 薪资" + wage +
                "/小时";
    }
}
