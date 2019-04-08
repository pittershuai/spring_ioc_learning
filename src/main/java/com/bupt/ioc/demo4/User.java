package com.bupt.ioc.demo4;

public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name +"  "+ "age:"+age;
    }
}
