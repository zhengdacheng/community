package com.dc.community.service;

import com.dc.community.pojo.DiscussPost;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zdc
 * @Date: 2021/12/13 11:08
 * @Description: //TODO
 * @version: 1.0
 */
public interface DiscussPostService {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    int selectDiscussPostRows(int userId);
}
