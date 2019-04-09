package com.bupt.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectAnno {
    //只对ProductDao类的save方法进行拦截
//    @Before(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.save(..))")
    //对所有ProductDao类的所有方法进行拦截
    @Before(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.save(..))")
//    传入JointPoint获取切点信息
    public void  before(JoinPoint joinPoint){
        System.out.println("前置通知==================" + joinPoint);
    }

    @AfterReturning(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.update(..))",returning = "result")
//    后置通知可以得到切入点的返回值
    public void  after(Object result){
        System.out.println("后置通知==================" + result);
    }
}
