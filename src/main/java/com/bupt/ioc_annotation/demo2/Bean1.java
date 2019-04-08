package com.bupt.ioc_annotation.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Bean1")
public class Bean1 {

    @PostConstruct
    public void init(){
        System.out.println("initBean...");
    }

    public void say(){
        System.out.println("say...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destoryBean...");
    }
}