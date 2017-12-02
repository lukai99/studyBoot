package com.jiu.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/12/2.
 * 事件(Application Event)
 * Spring的事件需要遵循如下流程
 * 1.自定义事件，继承ApplicationEvent
 * 2.定义事件监听器，实现AplicaitionListener
 * 3.使用容器发布事件
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("hello application event");

        context.close();
    }
}
