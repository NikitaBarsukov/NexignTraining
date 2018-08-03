package com.softdev.service;

import com.softdev.bean.Users;
import com.softdev.repository.UsersRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {

    @Autowired
    private UsersRepo repository;

    @Override
    public List<Users> findAll() {

        List<Users> users = (List<Users>) repository.findAll();

        return users;
    }
}