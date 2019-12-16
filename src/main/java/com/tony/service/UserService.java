package com.tony.service;

import com.tony.entity.User;
import com.tony.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    static Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;


    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    public User getByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }
}
