package com.jiu.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * Created by ASUS on 2017/12/2.
 */
@Configuration
@ComponentScan("com.jiu.ch2.el")
@PropertySource("classpath:test.properties")//注入配置文件
public class Elconfig {

    @Value("I LOVE ZZ")//注入普通字符串
    private String normal;
    @Value("#{systemProperties['os.name'] }")//注入系统属性
    private String osName;
    @Value("#{T(java.lang.Math).random() * 100.0 }")//注入表达式结果
    private double randomNumber;
    @Value("#{demoService.author }")//注入bean的属性
    private String fromAuthor;
    @Value("classpath:test.txt")//注入文件资源
    private Resource testFile;
    @Value("http://www.baidu.com")//注入网址资源
    private Resource testUrl;
    @Value("${book.name}")//注入配置文件属性
    private String bookName;

    @Autowired
    private Environment environment;

    /*
     *注入配置文件需使用@PropertySource指定文件地址，若使用@Value注入，则要配置一个PropertySourcesPlaceholderConfigurer
     * 的Bean。注意，@Value("${book.name}")使用的是"$"而不是"#"
     * 注入Properties还可以从Environment中获得
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAuthor);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
