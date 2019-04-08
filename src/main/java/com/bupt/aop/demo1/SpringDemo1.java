package com.bupt.aop.demo1;

import org.junit.Test;

public class SpringDemo1 {
    @Test
    public void demo1(){
        UserDao userDao = new UserDaoImpl();

//        userDao.save();
//        userDao.update();
//        userDao.delete();
//        userDao.find();

        UserDao proxy = (UserDao)new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
