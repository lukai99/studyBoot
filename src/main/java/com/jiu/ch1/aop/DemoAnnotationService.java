package com.jiu.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/12/2.
 * 编写使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){

    }
}
