package com.bupt.aspectJ.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectAnno {
    //只对ProductDao类的save方法进行拦截
//    @Before(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.save(..))")
    //对所有ProductDao类的所有方法进行拦截
    @Before(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.*(..))")
    public void  before(){
        System.out.println("前置通知==================");
    }
}
