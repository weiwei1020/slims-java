package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.School;
import com.example.demo.lims.vo.Test;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface TestMapper {
   Boolean insertTest(Test test);

   Boolean deleteTest(Test test);

   Boolean updateTest(Test test);

   Test selectTest(Test test);

   List<Test> selectAllTest();

   int selectCount();

   List<Test> pageTest(HashMap<String, Object> map);

   Boolean beginTest(Test test);

   Boolean pauseTest(Test test);

   Boolean terminationTest(Test test);

   Boolean endTest(Test test);


}
