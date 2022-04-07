package com.example.mysqltest;

import com.example.mysqltest.domain.Test1;
import com.example.mysqltest.mapper.TestMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;


@SpringBootTest
class ScoreApplicationTests {
    @Autowired
    private TestMapper testMapper;
    @Test
    public void testFindAll(){
        List<Test1> list= testMapper.findall();
        System.out.println(list);

    }

    @Test
    void contextLoads() {
    }

}