package com.example.mysqltest.mapper;

import com.example.mysqltest.domain.Test1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestMapperTestInsert {
    //@Autowired
    @Resource
    private TestMapper testMapper;
    @Test
    void InsertTestById() {
        Test1 test1=new Test1();
        test1.setId(1000);
        test1.setName("spring");
        test1.setPassword("03228675");
        int i=testMapper.insertTest1(test1);
        assertEquals(1,i);
    }
}