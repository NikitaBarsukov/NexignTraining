package com.softdev.service;

import com.softdev.bean.Orders;
import com.softdev.repository.OrdersRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService implements IOrdersService {

    @Autowired
    private OrdersRepo repository;

    @Override
    public List<Orders> findAll() {

        List<Orders> orders = (List<Orders>) repository.findAll();

        return orders;
    }
}