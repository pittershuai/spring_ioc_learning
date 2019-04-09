package com.bupt.springTransaction.service;

import com.bupt.springTransaction.entity.Foo;

public interface FooService {
    Foo getFoo(String name);

    Foo getFoo(String name, String barname);
    void insertFoo(Foo foo);
    void updateFoo(Foo foo);
}
