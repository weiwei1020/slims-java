package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.School;
import com.example.demo.lims.vo.Test;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@Weijie
实验管理
 */
@Repository
public interface TestMapper {
   //添加实验管理
   Boolean insertTest(Test test);

   //删除实验管理
   Boolean deleteTest(Test test);

   //修改实验管理
   Boolean updateTest(Test test);

   //查询某条实验管理详细信息
   Test selectTest(Test test);

   //查询所有实验管理列表
   List<Test> selectAllTest();

   //查询所有实验管理列表条数
   int selectCount();

   //以分页形式查询所有实验管理列表
   List<Test> pageTest(HashMap<String, Object> map);

   //开始实验
   Boolean beginTest(Test test);

   //暂停实验
   Boolean pauseTest(Test test);

   //中止实验
   Boolean terminationTest(Test test);

   //结束实验
   Boolean endTest(Test test);

   //查询所有实验列表
   List<Test> testManage(HashMap<String, Object> map);

}
