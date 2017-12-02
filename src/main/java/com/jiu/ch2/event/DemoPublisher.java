package com.jiu.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/12/2.
 * 事件发布类
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext context;//注入ApplicationContext用来发布事件

    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
