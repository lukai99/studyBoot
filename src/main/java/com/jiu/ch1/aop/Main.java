package com.jiu.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/12/2.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
               new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService =
                context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService =
                context.getBean(DemoMethodService.class);

        annotationService.add();
        methodService.add();
        context.close();
    }
}
