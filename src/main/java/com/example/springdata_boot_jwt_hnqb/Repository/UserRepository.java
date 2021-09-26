package com.example.springdata_boot_jwt_hnqb.Repository;

import com.example.springdata_boot_jwt_hnqb.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
