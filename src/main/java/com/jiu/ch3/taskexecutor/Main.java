package com.jiu.ch3.taskexecutor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/12/3.
 * spirng通过任务执行器（TaskExecutor）来实多线程和并发编程。使用ThreadPoolTaskExecutor可实现一个基于线程池的TaskExecutory。
 *而事件开发中任务一般是非阻碍的，即异步的，所以我们要在配置类中通过@EnableAsync开启对异步任务的支持，并通过在实际执行的Bean的方法
 * 中使用@Async注解来声明其是一个异步任务
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
