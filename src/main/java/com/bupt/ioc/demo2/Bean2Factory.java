package com.bupt.ioc.demo2;

/**
 * Bean2的静态工厂
 */
public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("Bean2被创建");
        return new Bean2();
    }
}
