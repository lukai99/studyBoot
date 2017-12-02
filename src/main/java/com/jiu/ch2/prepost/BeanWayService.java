package com.jiu.ch2.prepost;

/**
 * Created by ASUS on 2017/12/2.
 * 使用@Bean的形式的Bean
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造器：BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
