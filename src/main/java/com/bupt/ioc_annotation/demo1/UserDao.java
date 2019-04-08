package com.bupt.ioc_annotation.demo1;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    public void save(){
        System.out.println("DAO中保存用户...");
    }
}
