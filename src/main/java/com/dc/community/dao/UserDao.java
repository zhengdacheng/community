package com.dc.community.dao;

import com.dc.community.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: zdc
 * @Date: 2021/12/12 20:33
 * @Description: //TODO
 * @version: 1.0
 */

@Mapper
public interface UserDao {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
