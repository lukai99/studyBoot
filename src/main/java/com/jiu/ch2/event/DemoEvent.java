package com.jiu.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ASUS on 2017/12/2.
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
