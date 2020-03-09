package com.pyg.springsecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.pyg.springsecurity.mapper")
public class SpringSecurtyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurtyApplication.class, args);
    }
}
