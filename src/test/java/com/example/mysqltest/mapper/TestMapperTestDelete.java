package com.example.mysqltest.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestMapperTestDelete {
    @Autowired
    private TestMapper testMapper;
    @Test
    void deleteTest() {
        int i=testMapper.deleteTest(1000);
        assertEquals(1,i);
    }
}