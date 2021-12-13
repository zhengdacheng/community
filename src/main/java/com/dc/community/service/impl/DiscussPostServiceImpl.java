package com.dc.community.service.impl;

import com.dc.community.dao.DiscussPostDao;
import com.dc.community.pojo.DiscussPost;
import com.dc.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zdc
 * @Date: 2021/12/13 11:09
 * @Description: //TODO
 * @version: 1.0
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {
    @Autowired
    private DiscussPostDao discussPostDao;
    @Override
    public List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit) {
        return discussPostDao.selectDiscussPosts(userId,offset,limit);
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return discussPostDao.selectDiscussPostRows(userId);
    }
}
