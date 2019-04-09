package com.bupt.aspectJ.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aspectJ1.xml")
public class SpringDemo1 {
    @Resource(name = "productDao")
    ProductDao productDao;
    @Test
    public void demo1(){
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.findAll();
        productDao.findOne();
    }
}
