package com.bupt.ioc_annotation.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    @Test
    public void demo1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) classPathXmlApplicationContext.getBean("Bean1");
        bean1.say();
        classPathXmlApplicationContext.close();
    }
}
