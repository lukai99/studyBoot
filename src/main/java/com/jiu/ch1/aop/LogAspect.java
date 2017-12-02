package com.jiu.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by ASUS on 2017/12/2.
 * 编写切面
 */
@Aspect//通过注解声明一个切面
@Component
public class LogAspect {

    @Pointcut("@annotation(com.jiu.ch1.aop.Action)")//通过@PointCut注解声明切点
    public void annotationPointCut(){

    }

    @After("annotationPointCut()")//通过@After注解声明一个建言，并使用@PointCut定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());
    }

    @Before("execution(* com.jiu.ch1.aop.DemoMethodService.*(..))")//声明一个建言，使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法式拦截 "+method.getName());
    }
}
