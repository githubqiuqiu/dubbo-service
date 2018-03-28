package com.ht.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ht.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auth Qiu
 * @time 2018/3/28
 **/
//注意 此处的service 不要用spring的service  要用alibaba的service
@Service
@Transactional
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "hello: "+name;
    }
}
