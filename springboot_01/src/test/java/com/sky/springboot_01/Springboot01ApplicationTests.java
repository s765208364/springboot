package com.sky.springboot_01;

import com.sky.springboot_01.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
