package com.bupt.springTransaction.service;

import com.bupt.springTransaction.entity.Foo;

/**
 * POJO服务类
 */
public class DefaultFooService implements FooService {
    @Override
    public Foo getFoo(String name) {
        Foo f = new Foo();
        f.setName(name);
        f.setLevel(8);
        f.setBarName("默认吧名：Q吧");
        return f;
        // throw new UnsupportedOperationException();
    }

    @Override
    public Foo getFoo(String name, String barname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }
}
