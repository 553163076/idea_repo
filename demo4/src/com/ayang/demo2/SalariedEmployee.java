package com.ayang.demo2;

import java.util.EnumMap;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 15:59 2020/8/5
 * @Modified By:
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;
    private int workingDay;
    private int totalDays;

    public SalariedEmployee(double monthlySalary, int workingDay, int totalDays) {
        this.monthlySalary = monthlySalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public SalariedEmployee(int number, String name, int year, int month, int day, double monthlySalary, int workingDay, int totalDays) {
        super(number, name, year, month, day);
        this.monthlySalary = monthlySalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public SalariedEmployee(int number, String name, MyDate birthday, double monthlySalary, int workingDay, int totalDays) {
        super(number, name, birthday);
        this.monthlySalary = monthlySalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    @Override
    public double earnings() {
        return monthlySalary * workingDay / totalDays;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",月薪：" + monthlySalary +
                ", 出勤：" + workingDay +
                ", 工作日：" + totalDays;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
}
