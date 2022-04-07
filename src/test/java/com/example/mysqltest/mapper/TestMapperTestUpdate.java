package com.example.mysqltest.mapper;

import com.example.mysqltest.domain.Test1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestMapperTestUpdate {
    @Autowired
    private TestMapper testMapper;
    @Test
    void updateTest() {
        Test1 test1=new Test1();
        test1.setName("www");
        test1.setPassword("213241");
        test1.setId(1001);
        int i=testMapper.updateTest(test1);
        System.out.println(i);
    }
}