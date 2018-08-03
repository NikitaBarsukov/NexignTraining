package com.softdev;


import com.softdev.bean.Orders;
import com.softdev.bean.Users;
import com.softdev.service.IOrdersService;
import java.util.List;
import java.util.stream.Collectors;

import com.softdev.service.IUsersService;
import com.softdev.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    IOrdersService ordersService;
    @Autowired
    IUsersService usersService;


    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public String showOrders() {

        List<Orders> orders = (List<Orders>) ordersService.findAll();

        String result = orders.stream().map(x -> x.toString())
                .collect(Collectors.joining(", ", "{", "}"));
        return result;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String showUsers() {

        List<Users> users = (List<Users>) usersService.findAll();

        String result = users.stream().map(x -> x.toString())
                .collect(Collectors.joining(", ", "{", "}"));
        return result;
    }
}