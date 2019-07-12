package com.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UsersMapper;
import com.demo.model.Users;



@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper userDao;


    public Users getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public boolean addUsers(Users record){
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}