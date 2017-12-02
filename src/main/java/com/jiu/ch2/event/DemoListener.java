package com.jiu.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/12/2.
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{//实现ApplicaitionListener接口，并指定监听的事件类型

    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();

        System.out.println("我(bean-DemoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
