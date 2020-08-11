package com.ayang.team.service;

import com.ayang.team.bean.*;

import java.util.Arrays;

import static com.ayang.team.service.Data.*;

/**
 * @Author: Yang
 * @Description: 1存储全公司的员工对象
 * 2获取全公司的员工对象
 * 3根据编号获取员工对象
 * @Date: Created in 12:00 2020/8/6
 * @Modified By:
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
//        从Data.java把数据初始化到employees数组当中。
        init();
    }

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    //    存储和初始化全公司的员工对象
    private void init() {
//        创建员工数组对象，指定长度
        employees = new Employee[EMPLOYEES.length];
//        为每个员工对象赋值
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int empType = Integer.parseInt(EMPLOYEES[i][0]);

            int id = Integer.parseInt(EMPLOYEES[i][1]);

            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            switch (empType) {
                case EMPLOYEE:
//                    创建Employee对象，放到employees数组
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
//                    创建PROGRAMMER对象，放到employees数组
                    Equipment equipment = getLineNumber(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
//                    创建DESIGNER对象，放到employees数组
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    equipment = getLineNumber(i);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
//                    创建ARCHITECT对象，放到employees数组
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    equipment = getLineNumber(i);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;

            }
        }

    }

    private Equipment getLineNumber(int i){
//        根据Data类EQIPMENTS二维数组的第一行第【0】列来决定创建什么设备对象
        int equipType = Integer.parseInt(EQIPMENTS[i][0]);
        switch (equipType){
            case PC:
                return new PC(EQIPMENTS[i][1], EQIPMENTS[i][2]);
            case NOTEBOOK:
                return new NoteBook(EQIPMENTS[i][1], Double.parseDouble(EQIPMENTS[i][2]));
            case PRINTER:
                return new Printer(EQIPMENTS[i][1], EQIPMENTS[i][2]);
            default:
                return null;
        }
    }

    //可以获取全公司的员工对象
    public Employee[] getALL() {
//        return employees
        return Arrays.copyOf(employees, employees.length);

    }

    //根据员工的编号获取一个员工对象
    public Employee getById(int id) throws TeamException {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new TeamException("编号为" + id + "的员工不存在！");
    }
}
