package com.example.mysqltest.mapper;

import com.example.mysqltest.domain.Test1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
//@Service //使用注解

public interface TestMapper {
    // @Select("select * from test")//注解
    //创建XML映射文件，编写sql语句

    public List<Test1> findall();
    //增删改查
    public Test1 queryTestById(int id);
    //添加数据
    public int insertTest1(Test1 test1);
    //修改数据
    public int updateTest(Test1 test1);
    //删除数据
    public int deleteTest(int id);
}