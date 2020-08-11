package com.ayang.demo1;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 11:31 2020/8/5
 * @Modified By:
 */
public class CheckPoint {
    public void check(Vehicle v){
        v.stop();
        if (v instanceof Bus){
            Bus bus = (Bus) v;
            bus.count();
        }else if(v instanceof Trunk){
            Trunk t = (Trunk) v;
            t.checkWeight();
        }
        v.start();
        v.run();
    }
}
