package com.dc.community;

import com.dc.community.dao.UserDao;
import com.dc.community.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

/**
 * @Author: zdc
 * @Date: 2021/12/12 20:56
 * @Description: //TODO
 * @version: 1.0
 */
@SpringBootTest
@ContextConfiguration(classes = ComunityApplication.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void userSelectTest(){
        User user = userDao.selectById(101);
        System.out.println(user);

        user = userDao.selectByName("liubei");
        System.out.println(user);

        user = userDao.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUserName("test");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        int rows = userDao.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser() {
        int rows = userDao.updateStatus(150, 1);
        System.out.println(rows);

        rows = userDao.updateHeader(150, "http://www.nowcoder.com/102.png");
        System.out.println(rows);

        rows = userDao.updatePassword(150, "hello");
        System.out.println(rows);
    }
}
