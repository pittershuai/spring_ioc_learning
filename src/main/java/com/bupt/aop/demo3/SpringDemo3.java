package com.bupt.aop.demo3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

//     @Resource(name="studentDao")  //注入studentDao的话并没有增强方法
    @Resource(name="studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1(){
//        通过测试注解的方式可以省掉如下代码
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) applicationContext.getBean("beanName");

        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
