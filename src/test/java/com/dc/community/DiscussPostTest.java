package com.dc.community;

import com.dc.community.dao.DiscussPostDao;
import com.dc.community.pojo.DiscussPost;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: zdc
 * @Date: 2021/12/13 10:51
 * @Description: //TODO
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ComunityApplication.class)
public class DiscussPostTest {
    @Autowired
    private DiscussPostDao discussPostDao;

    @Test
    public void test(){
        List<DiscussPost> discussPosts = discussPostDao.selectDiscussPosts(149, 0, 20);
        System.out.println(discussPosts.toString());

        int rows = discussPostDao.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}
