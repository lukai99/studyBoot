package com.jiu.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASUS on 2017/12/3.
 * Spring Aware
 * Sprong Aware的目的是为了让bean获得spring容器的服务。因为ApplicationContext接口集成了MessageSource接口、
 * ApplicationEventPublisher接口和RseourceLoader接口，所以bean继承ApplicationContextAware可以获得spring容器的所有服务，
 * 但原则上我们还是用到什么接口，就实现什么接口
 * Spring提供的Aware接口
 * BeanNameAware  获得到容器中Bean的名称
 * BeanFactoryAware  获得bean factory,这样可以调用容器的服务
 * ApplicationContextAware  当前的application conetxt,这样可以调用容器的服务
 * MessageSourceAware  获得message source,这样可以获得文本信息
 * ApplicationEventPublisherAware  应用事件发布器，可以发布事件
 * ResourceLoaderAware  获得资源加载器，可以获得外部资源文件
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();
        context.close();
    }
}
