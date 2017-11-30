package com.jiu.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/11/30.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("GitHub"));
        context.close();
    }
}
