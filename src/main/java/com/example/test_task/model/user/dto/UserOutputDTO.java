package com.example.test_task.model.user.dto;

import com.example.test_task.model.user.User;
import lombok.Data;

@Data
public class UserOutputDTO {

    private String username;

    public UserOutputDTO(User user) {
        this.username = user.getUsername();
    }
}
