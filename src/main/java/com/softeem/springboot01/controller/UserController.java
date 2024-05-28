package com.softeem.springboot01.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.softeem.springboot01.entity.User;
import com.softeem.springboot01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public String login(String username,String password){
        // 1. 根据用户名查询该用户是否存在
        QueryWrapper<User> query = Wrappers.query(User.class);
        query.eq("username", username);

        // 根据用户名查询该用户是否存在
        User user = userMapper.selectOne(query);
        if (Objects.isNull(user)) {
            // 2. 若不存在返回错误提示：账号错误
            return "账号错误";
        }

        // 3. 判断输入的密码和数据库中存储的密码是否一致
        if (!user.getPassword().equals(password)) {
            // 4. 若不一致则返回错误提示：密码错误
            return "密码错误";
        }

        // 若一致则返回登录成功的提示信息
        return "恭喜你，登录成功！";
    }

    @RequestMapping("/reg")
    public String reg(String username,String password){
        //构建查询条件包装器  where username=?
        QueryWrapper<User> query = Wrappers.query(User.class);
        query.eq("username",username);

        //根据用户名查询该用户是否存在  select * from user where username=?
        User user = userMapper.selectOne(query);
        if(Objects.nonNull(user)){
            return "对不起，该用户已存在";
        }
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        int i = userMapper.insert(user);

        return i > 0 ? "注册成功" : "注册失败";
    }

}
