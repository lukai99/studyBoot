package com.jiu.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/12/2.
 * Spring EL和资源调用
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Elconfig.class);

        Elconfig resourceService = context.getBean(Elconfig.class);

        resourceService.outputResource();

        context.close();
    }
}
