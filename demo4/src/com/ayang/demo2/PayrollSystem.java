package com.ayang.demo2;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.EnumMap;
import java.util.Scanner;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 16:21 2020/8/5
 * @Modified By:
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new SalariedEmployee(1001, "张三",1993,3,3,15000,20,22);
        arr[1] = new HourlyEmployee(1002, "李四", new MyDate(1994, 4, 4), 80, 100);
        arr[2] = new SalariedEmployee(1003, "王五",new MyDate(1996, 7, 5),15000,23,22);

        for (Employee employee : arr) {
            System.out.println(employee);
            System.out.println("实发工资：" + employee.earnings());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本月月份：");
        int month = input.nextInt();
        for (Employee employee:arr){
            if (employee.getBirthday().getMonth() == month){
                System.out.println("实发工资：" + (employee.earnings() + 100));
            }else {
                System.out.println("实发工资：" + employee.earnings());
            }
        }
    }
}
