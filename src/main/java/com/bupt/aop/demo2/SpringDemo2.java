package com.bupt.aop.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo2(){
        ProductDao productDao = new ProductDao();
        MyCglibProxy myCglibProxy = new MyCglibProxy(productDao);
        ProductDao proxy = (ProductDao) myCglibProxy.createProxy();
        proxy.save();
        proxy.find();
        proxy.delete();
        proxy.update();
    }

}
