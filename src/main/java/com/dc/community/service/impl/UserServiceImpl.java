package com.dc.community.service.impl;

import com.dc.community.dao.UserDao;
import com.dc.community.pojo.User;
import com.dc.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zdc
 * @Date: 2021/12/12 20:53
 * @Description: //TODO
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(int id) {
        return userDao.selectById(id);
    }
}
