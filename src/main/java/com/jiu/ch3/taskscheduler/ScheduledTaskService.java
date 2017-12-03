package com.jiu.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ASUS on 2017/12/3.
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次："+format.format(new Date()));
    }

    @Scheduled(cron = "0 57 13 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定的时间"+format.format(new Date())+"执行");
    }
}
