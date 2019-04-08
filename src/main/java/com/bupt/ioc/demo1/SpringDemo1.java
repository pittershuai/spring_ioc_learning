package com.bupt.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo1 {
    @Test
    /**
     * 传统方式
     */
    public void demo1(){
        UserService user = new UserServiceImpl();
        user.sayHello();

        //设置属性，需要修改源代码
        UserServiceImpl user1 = new UserServiceImpl();
        user1.setName("张三");
        user1.sayHello();
    }

    @Test
    public void demo2(){
        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService user= (UserService) applicationContext.getBean("UserService");
        user.sayHello();
    }
    @Test
    /**
     * 读取磁盘系统中的配置文件
     */
    public void demo3(){
        // 创建Spring的工厂类:
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
        // 通过工厂获得类:
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    @Test
    /**
     * 传统方式的工厂类:Bean2Factory
     */
    public void demo4(){
        // 创建工厂类:
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        // 通过工厂获得类:
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }

    /**
     * 传统方式的工厂类:Bean2Factory
     */
    @Test
    public void demo5(){
        // 创建工厂类:
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("c:\\applicationContext.xml"));
        // 通过工厂获得类:
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }

}
