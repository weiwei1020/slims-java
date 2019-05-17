package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@Weijie
学校
 */
@Repository
public interface SchoolMapper {
   //添加学校
   Boolean insertSchool(School school);

   //删除学校
   Boolean deleteSchool(School school);

   //修改学校
   Boolean updateSchool(School school);

   //查询某一条学校详细信息
   School selectSchool(School school);

   //查询所有学校列表
   List<School> selectAllSchool();

   //查询所有学校列表条数
   int selectCount();

   //以分页形式查询学校列表
   List<School> pageSchool(HashMap<String, Object> map);


}
