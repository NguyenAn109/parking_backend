package com.parking.serviceImpl;

import com.parking.entity.User;
import com.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSeviceImpl implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public Optional<User> findByEmail(String email) {
        return userService.findByEmail(email);
    }
}
