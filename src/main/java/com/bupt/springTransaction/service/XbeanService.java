package com.bupt.springTransaction.service;

import com.bupt.springTransaction.entity.Xbean;

public interface XbeanService {
    Xbean getXbean(int id);
    void insertXbean(Xbean xb);
}
