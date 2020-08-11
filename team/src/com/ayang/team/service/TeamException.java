package com.ayang.team.service;

import org.junit.Test;

/**
 * @Author: Yang
 * @Description:
 * 1继承Throwable或它的子类
 * 2构造器，尽量保留两个
 * 3必须手动throw
 * @Date: Created in 14:46 2020/8/6
 * @Modified By:
 */
public class TeamException extends Throwable {
    public TeamException(String s) {
    }

    @Test
    public void Test(){
        System.out.println("haahhah");
    }
}
