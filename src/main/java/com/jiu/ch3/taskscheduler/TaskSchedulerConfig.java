package com.jiu.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by ASUS on 2017/12/3.
 */
@Configuration
@ComponentScan("com.jiu.ch3.taskscheduler")
@EnableScheduling//开启对计划任务的支持
public class TaskSchedulerConfig {
}
