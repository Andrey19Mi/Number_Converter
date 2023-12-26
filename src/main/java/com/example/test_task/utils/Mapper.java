package com.example.test_task.utils;

import com.example.test_task.model.user.User;
import com.example.test_task.model.user.dto.UserInputDTO;
import com.example.test_task.model.user.dto.UserOutputDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    @Autowired
    private ModelMapper mapper;

    public User mapUser(UserInputDTO user){
        return mapper.map(user, User.class);
    }
    public UserOutputDTO mapUser(User user){
        return mapper.map(user, UserOutputDTO.class);
    }

}
