package com.example.test_task;

import com.example.test_task.model.converter.Converter;
import com.example.test_task.model.user.User;
import com.example.test_task.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TestTaskApplication {



    public static void main(String[] args) {
        SpringApplication.run(TestTaskApplication.class, args);
    }

}
