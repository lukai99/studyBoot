package com.jiu.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ASUS on 2017/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)//SpringJUnit4ClassRunner在JUnit环境下提供SpringTestContextFramework的功能
@ContextConfiguration(classes = {TestConfig.class})//用来加载配置ApplicationContext，其中classes属性来加载配置类
@ActiveProfiles("prod")
public class DemoBeanIngegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
