package com.bupt.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围的测试
 */
public class SpringDemo3 {
    @Test
    /**
     * Bean的作用范围的测试
     */
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person)applicationContext.getBean("Person");
        Person person2 = (Person)applicationContext.getBean("Person");
        System.out.println(person1);
        System.out.println(person2);
    }
}
