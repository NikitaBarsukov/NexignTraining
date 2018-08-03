package com.softdev.service;

import com.softdev.bean.Orders;
import java.util.List;

public interface IOrdersService {
    public List<Orders> findAll();
}