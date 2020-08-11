package com.ayang.demo3;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 17:42 2020/8/5
 * @Modified By:
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee[] all = new Employee[5];
        all[0] = new Employee(1, "张三", Status.BUSY);
        all[1] = new Employee(2, "李四", Status.FREE);
        all[2] = new Employee(3, "王五", Status.LEFT);
        all[3] = new Employee(4, "李刘", Status.VOCATION);
        all[4] = new Employee(5, "王琪", Status.LEFT);

        for (Employee employee : all) {
            System.out.println(employee);
        }

    }
}
