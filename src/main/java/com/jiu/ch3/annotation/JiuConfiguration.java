package com.jiu.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by ASUS on 2017/12/3.
 * 示例组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//组合@Configuration元注解
@ComponentScan//组合@ComponentScan元注解
public @interface JiuConfiguration {
    String[] value() default {};//覆盖value参数
}
