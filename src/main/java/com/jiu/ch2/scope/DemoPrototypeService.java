package com.jiu.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/12/2.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
