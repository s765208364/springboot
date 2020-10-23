package com.sky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql = "select * from user";
        List<Map<String,Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;

    }

    @GetMapping("/addUser")
    public String addUser(){
        String sql = "insert into mybatis.user(id,name,pwd) values(7,'sushen','123456')";
        jdbcTemplate.update(sql);

        return "update-ok";

    }

    @GetMapping("/updateUser")
    public String updateUser(@PathVariable("id") int id){
        String sql = "update mybatis.user set name=?,pwd=? where id="+id;
        Object[] objects = new Object[2];

        



        jdbcTemplate.update(sql);

        return "update-ok";

    }

    @GetMapping("/deleteUser")
    public String deleteUser(@PathVariable("id") int id){
        String sql = "update mybatis.user set where";
        jdbcTemplate.update(sql);

        return "update-ok";

    }
}
