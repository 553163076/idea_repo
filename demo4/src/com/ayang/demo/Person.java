package com.ayang.demo;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 10:23 2020/8/5
 * @Modified By:
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "name:"+name+",age:"+age;
    }
}
