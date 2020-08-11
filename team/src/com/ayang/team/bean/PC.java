package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:27 2020/8/6
 * @Modified By:
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }

    @Override
    public String getDescription() {
        return model+"("+display+")";
    }
}
