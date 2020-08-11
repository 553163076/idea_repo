package com.ayang.test;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 15:18 2020/8/7
 * @Modified By:
 */
public class Hello {

    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("hello world "+ name);
    }
}
