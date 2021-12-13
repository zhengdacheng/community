package com.dc.community.service;

import com.dc.community.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: zdc
 * @Date: 2021/12/12 20:34
 * @Description: //TODO
 * @version: 1.0
 */
public interface UserService {

    public User findUserById(int id);
}
