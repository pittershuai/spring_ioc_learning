package com.bupt.ioc_annotation.demo3;

import com.bupt.ioc_annotation.demo2.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
    @Test
    public void demo3(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService)applicationContext.getBean("productService");
        productService.save();
    }
}
