package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:56 2020/8/6
 * @Modified By:
 */
public class Printer implements Equipment{
    private String type;
    private String name;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Printer(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getDescription() {
        return type+"("+name+")";
    }
}

