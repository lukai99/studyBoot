package com.jiu.ch3.aware;

import com.jiu.ch2.event.DemoEvent;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/12/3.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware,ApplicationEventPublisherAware{

    private String beanName;
    private ResourceLoader loader;
    private ApplicationEventPublisher publisher;

    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void outputResult(){
        System.out.println("Beand的名称为："+beanName);

        Resource resource=
                loader.getResource("test.txt");

        try{
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }

        publisher.publishEvent(new DemoEvent(this,"你好啊！"));
    }


}
