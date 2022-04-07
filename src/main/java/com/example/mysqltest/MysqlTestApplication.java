package com.example.mysqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mysqltest.mapper")
@SpringBootApplication
public class MysqlTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(MysqlTestApplication.class, args);
    }

}
