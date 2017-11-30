package com.jiu.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/11/30.
 */

@Service
public class FunctionService {

    public String sayHello(String word){
        return "hello "+word+"！";
    }
}
