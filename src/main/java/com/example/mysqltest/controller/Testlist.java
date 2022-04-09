package com.example.mysqltest.controller;
import com.example.mysqltest.domain.Test1;
import com.example.mysqltest.services.TestService;
import com.example.mysqltest.mapper.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@RestController
public class Testlist {

    @Resource
    private TestService testService;
    @GetMapping("/list")//@RequestMapping("/test")
    //  @GetMapping("/test/list")
    public List<Test1> testlistall(){
        return testService.list();
    }
    @GetMapping("/query")
    public Test1 testQuery(int id){

        return testService.queryById(id);
    }

    @PostMapping("/add")//@PostMapping不能用浏览器，只能用postman添加
    public boolean addtest(Test1 test1){
        boolean addtest= testService.addtest(test1);
        return addtest;
    }
    @PostMapping("updatetest")
    public boolean update(Test1 test1){
        boolean b=testService.updateTest(test1);
        return b;
        //在testmapper.xml中有顺序
    }
    @GetMapping("/deletetest")
    public boolean delete(int id){
        boolean b=testService.deleteTest(id);
        return b;
    }
}