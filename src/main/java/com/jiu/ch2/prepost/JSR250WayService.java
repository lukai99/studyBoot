package com.jiu.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ASUS on 2017/12/2.
 * 使用JSR250形式的Bean
 */
public class JSR250WayService {

    @PostConstruct//在构造函数执行完之后执行
    public void init(){
        System.out.println("@jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造器：JSR250WayService");
    }

    @PreDestroy//在Bean销毁之前执行
    public void destory(){
        System.out.println("@jsr250-destory-method");
    }
}
