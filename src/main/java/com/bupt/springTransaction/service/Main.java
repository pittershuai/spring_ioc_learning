package com.bupt.springTransaction.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

public class Main {
    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-transcation.xml");//, MainBoot.class
        out.println(ctx);
        FooService fooService= (FooService)ctx.getBean("fooService");
        out.println( fooService.getFoo("sss"));
    }
}
