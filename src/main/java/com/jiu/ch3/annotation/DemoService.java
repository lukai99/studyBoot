package com.jiu.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/12/3.
 * 演示服务Bean
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样活得的Bean");
    }
}
