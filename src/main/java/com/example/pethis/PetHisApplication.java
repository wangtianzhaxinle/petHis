package com.example.pethis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pethis.mapper")
public class PetHisApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetHisApplication.class, args);
    }

}
