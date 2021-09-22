package com.example.springdata_boot_jwt_hnqb.Service;

import com.example.springdata_boot_jwt_hnqb.Entity.User;

import java.nio.file.attribute.UserPrincipal;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
