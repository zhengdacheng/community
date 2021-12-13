package com.dc.community.controller;

import com.dc.community.pojo.DiscussPost;
import com.dc.community.pojo.Page;
import com.dc.community.pojo.User;
import com.dc.community.service.DiscussPostService;
import com.dc.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zdc
 * @Date: 2021/12/12 20:29
 * @Description: //TODO
 * @version: 1.0
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        // 方法调用钱,SpringMVC会自动实例化Model和Page,并将Page注入Model.
        // 所以,在thymeleaf中可以直接访问Page对象中的数据.
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/home/index");

        List<DiscussPost> discussPosts = discussPostService.selectDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> maps = new ArrayList<>();
        if (discussPosts!=null){
            for (DiscussPost discussPost : discussPosts) {
                Map<String,Object>map=new HashMap<>();
                map.put("post",discussPost);
                User user = userService.findUserById(discussPost.getUserId());
                map.put("user",user);
                maps.add(map);
            }
        }
        model.addAttribute("maps",maps);
        return "/index";
    }
}
