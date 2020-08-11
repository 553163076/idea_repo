package com.ayang.demo;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:38 2020/8/5
 * @Modified By:
 */
public class TestExp1 {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        System.out.println(p.getInfo());

        Employee e = new Employee("李四", 24, 10000);
        System.out.println(e.getInfo());

        Manager m = new Manager("王五", 28, 70000, 5000);
        System.out.println(m.getInfo());


    }
}
