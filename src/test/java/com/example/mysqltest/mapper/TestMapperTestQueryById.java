package com.example.mysqltest.mapper;

import com.example.mysqltest.domain.Test1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestMapperTestQueryByid {
    @Autowired
    private TestMapper testMapper;
    @Test
    void queryTestById() {
        Test1 test1= testMapper.queryTestById(100);
        System.out.println(test1.getName());//打印值
        //assertEquals("xyz",test1.getName());
    }
}