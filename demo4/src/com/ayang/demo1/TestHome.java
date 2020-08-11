package com.ayang.demo1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:36 2020/8/5
 * @Modified By:
 */
public class TestHome {
    public static void main(String[] args) {
        CheckPoint cp = new CheckPoint();
        cp.check(new Bus());
        System.out.println("_________________");
        cp.check(new Trunk());

    }
}
