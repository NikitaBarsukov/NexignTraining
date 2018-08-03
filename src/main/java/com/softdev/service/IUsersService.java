package com.softdev.service;

import com.softdev.bean.Users;
import java.util.List;

public interface IUsersService {
    public List<Users> findAll();
}