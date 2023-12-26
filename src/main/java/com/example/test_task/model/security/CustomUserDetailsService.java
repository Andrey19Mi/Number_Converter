package com.example.test_task.model.security;

import com.example.test_task.model.user.User;
import com.example.test_task.model.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) {
        Optional<User> user = userRepository.findByUsername(login);
        return user.map(CustomUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("пользователь не найден"));
    }
}
