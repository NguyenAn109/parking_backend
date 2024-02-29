package com.parking.service;

import com.parking.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);
}
