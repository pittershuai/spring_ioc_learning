package com.bupt.ioc.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式：采用无参数的构造方法的方式
 */

public class SpringDemo2 {
    @Test
    public void demo1(){
        // 创建工厂
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例:
        Bean1 bean1 = (Bean1)applicationContext.getBean("Bean1");
    }

    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2)applicationContext.getBean("Bean2");
    }
    @Test
    public void demo3(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3)applicationContext.getBean("Bean3");
    }
}
