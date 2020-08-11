package com.ayang.demo3;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 17:42 2020/8/5
 * @Modified By:
 */
public class Employee {
    private int eid;
    private String name;
    private Status status;

    public Employee(){

    }

    public Employee(int eid, String name, Status status) {
        this.eid = eid;
        this.name = name;
        this.status = status;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
