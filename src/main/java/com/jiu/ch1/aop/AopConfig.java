package com.jiu.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by ASUS on 2017/12/2.
 */
@Configuration
@ComponentScan("com.jiu.ch1.aop")
@EnableAspectJAutoProxy//开启Spring对AspentJ的支持
public class AopConfig {
}
