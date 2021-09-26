package com.example.springdata_boot_jwt_hnqb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.springdata_boot_jwt_hnqb.Entity")
public class SpringdataBootJwtHnqbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataBootJwtHnqbApplication.class, args);
    }

}
