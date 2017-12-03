package com.jiu.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by ASUS on 2017/12/3.
 */
@Configuration
@ComponentScan("com.jiu.ch3.taskexecutor")
@EnableAsync//开启异步任务的支持
/**
 * 实现AsyncConfigurer接口并重写getAsyncExecutor方法，
 * 并返回一个ThreadPoolTaskExecutor,这样我们就获得了一个基于线程池TaskExecutor
 */
public class TaskExecutorConfig implements AsyncConfigurer{

    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor
                = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();
        return executor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
