package com.example.test_task.model.user;

import com.example.test_task.model.converter.ConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ConverterRepository converterRepository;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {
        if (!userRepository.findByUsername("user").isPresent()){
            userRepository.save(new User("user", encoder.encode("user")));
        }
    }
}
