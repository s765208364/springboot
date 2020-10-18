package com.sky.springboot_01.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String firstName;

    private Integer age;

    public Dog(String name, Integer age) {
        this.firstName = name;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
