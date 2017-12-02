package com.jiu.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by ASUS on 2017/12/2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
