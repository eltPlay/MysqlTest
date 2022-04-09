package com.example.mysqltest.services;

import com.example.mysqltest.domain.Test1;
import com.example.mysqltest.mapper.TestMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;
    public List<Test1> list(){

        return testMapper.findall();
    }
    public Test1 queryById(int id){
        return testMapper.queryTestById(id);
    }
    public  boolean addtest(@NotNull Test1 test1){
        if ((test1.getId() > 0 && !"".equals(test1.getId())) &&
                (test1.getName() != null && !"".equals(test1.getName())) &&
                (test1.getPassword() != null && !"".equals(test1.getPassword()))) {
            try {
                int i=testMapper.insertTest1(test1);
                if(i==1){
                    return true;
                }else{
                    throw new RuntimeException("添加数据失败");
                }

            }catch (Exception e){
                throw new RuntimeException("添加数据失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("无效数据");
        }
    }

    public boolean updateTest(@NotNull Test1 test1){

        if(test1.getId()>0 && test1.getName()!=null && !"".equals(test1.getName())
                && test1.getPassword()!=null && !"".equals(test1.getPassword())){
            try{
                int i=  testMapper.updateTest(test1);
                if(i>0){
                    return true;
                }
                else {
                    throw new RuntimeException("修改数据失败");
                }
            }catch (Exception e){
                throw new RuntimeException("修改数据失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("无效数据");
        }
    }
    public  boolean deleteTest(int id){
        if(id>0){
            try{
                int i=testMapper.deleteTest(id);
                if(i>0){
                    return true;
                }else {
                    throw new RuntimeException("删除失败");
                }
            }catch (Exception e){
                throw new RuntimeException("删除失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("数据无效");
        }
    }
}
