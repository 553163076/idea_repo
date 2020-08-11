package com.ayang.team.bean;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:51 2020/8/6
 * @Modified By:
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
}
