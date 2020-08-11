package com.ayang.demo3;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 17:38 2020/8/5
 * @Modified By:
 */
public enum Status {
    FREE("空闲"),BUSY("忙"),VOCATION("度假"),LEFT("离职");
    private final String desc;
    /**
     *
     * 功能描述: 打印信息
     *
     * @auther: ayang
     * @date: 2020/8/5 18:18
     */
    Status(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return name() + ":" + desc;
    }
}
