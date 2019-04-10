package com.bupt.springTransaction.service;

import com.bupt.springTransaction.entity.Xbean;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//相当于定义了一个切面，该类中的任何方法都符合事务ACID原则。若只想对某个方法执行事务，可以将@Transactional直接加在方法上
public class XbeanServiceImpl  implements XbeanService{
    @Override
//    @Transactional
    public Xbean getXbean(int id) {
        Xbean xb = new Xbean() ;
        xb.setXid(id);
        xb.setName("Bean默认名称");
        return xb ;
    }

    @Override
    public void insertXbean(Xbean xb) {
        throw new UnsupportedOperationException();
    }
}
