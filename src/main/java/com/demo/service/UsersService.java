package com.demo.service;

import com.demo.model.Users;

public interface UsersService {
    public Users getUserById(int userId);

    boolean addUsers(Users record);
}
