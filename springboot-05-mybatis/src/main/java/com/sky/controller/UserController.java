package com.sky.controller;

import com.sky.mapper.UserMapper;
import com.sky.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for(User user:userList){
            System.out.println(user);

        }
        return userList;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(8,"skygod","123456"));
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(8,"skygod","654321"));
        return "ok";
    }

    @GetMapping("/deleteUser")
    public  String deleteUser(){
        userMapper.deleteUser(5);
        return "ok";

    }


}
