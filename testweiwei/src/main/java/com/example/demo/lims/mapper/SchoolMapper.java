package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Company;
import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface SchoolMapper {
   Boolean insertSchool(School school);

   Boolean deleteSchool(School school);

   Boolean updateSchool(School school);

   School selectSchool(School school);

   List<School> selectAllSchool();

   int selectCount();

   List<School> pageSchool(HashMap<String, Object> map);


}
