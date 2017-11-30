package com.jiu.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/11/30.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String sayHello(String word){

        return functionService.sayHello(word);
    }
}
