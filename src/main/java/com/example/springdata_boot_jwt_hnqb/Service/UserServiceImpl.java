package com.example.springdata_boot_jwt_hnqb.Service;

import com.example.springdata_boot_jwt_hnqb.Entity.User;
import com.example.springdata_boot_jwt_hnqb.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}
