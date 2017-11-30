package com.jiu.ch1.javaconfig;

import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ASUS on 2017/11/30.
 */

public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
