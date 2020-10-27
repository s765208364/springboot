package com.sky;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sky.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("sky","123");



    }

    @Test
    public void test() throws JsonProcessingException {

        User user = new User("sky",3);
        String jsonUser = new ObjectMapper().writeValueAsString(user);

        redisTemplate.opsForValue().set("user",jsonUser);
        System.out.println(redisTemplate.opsForValue().get("user"));

    }


}
