package com.bupt.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.Test;

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

    @Around(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前==================");
        Object obj = joinPoint.proceed();// 执行目标方法,若不写这句delete()是不会被执行的
        System.out.println("环绕通知后==================");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.bupt.aspectJ.demo1.ProductDao.findOne(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出通知=============="+e.getMessage());
    }

    @After(value="execution(* com.bupt.aspectJ.demo1.ProductDao.findAll(..))")
    //无论是否抛异常都会执行
    public void after2(){
        System.out.println("最终通知==================");
    }
}
