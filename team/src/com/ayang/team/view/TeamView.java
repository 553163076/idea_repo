package com.ayang.team.view;

import com.ayang.team.bean.Employee;
import com.ayang.team.service.NameListService;

import java.util.EnumMap;
import java.util.Scanner;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 15:35 2020/8/6
 * @Modified By:
 */
public class TeamView {

    public static void main(String[] args) {
        while (true){
            System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
            System.out.println("ID\t\t 姓名\t\t 年龄\t\t 工资\t\t 职位\t\t 状态\t\t 奖金\t\t 股票\t\t 领用设备");
            getAllEmployee();
            System.out.println("---------------------------------------------------------------------------------------------------\n");
            System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)： \n");
            Scanner key = new Scanner(System.in);
            break;
        }
    }

    private static void getAllEmployee() {
        NameListService ns = new NameListService();
        Employee[] all = ns.getALL();
        for (Employee employee:all){
            System.out.println(employee);
        }
    }
    private void addTeamMember() {
    }
    private void removeEmployee() {
    }
    private void listTeamMember() {
    }

}
