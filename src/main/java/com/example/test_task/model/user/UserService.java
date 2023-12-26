package com.example.test_task.model.user;

import com.example.test_task.model.user.dto.UserInputDTO;
import com.example.test_task.model.user.dto.UserOutputDTO;
import com.example.test_task.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Mapper mapper;
    @Autowired
    private PasswordEncoder encoder;

    public UserOutputDTO createUser(UserInputDTO userInput){
        User user = mapper.mapUser(userInput);
        user.setPassword(encoder.encode(userInput.getPassword()));
        userRepository.save(user);
        return mapper.mapUser(user);
    }
}
