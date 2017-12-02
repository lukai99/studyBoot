package com.jiu.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/12/2.
 */
@Service//默认是singletion 相当于Scope("singleton")
public class DemoSingletonService {
}
