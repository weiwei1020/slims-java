package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Person;
import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
人员管理
 */
@Repository
public interface PersonMapper {
   //添加人员
   Boolean insertPerson(Person school);

   //删除人员
   Boolean deletePerson(Person school);

   //修改人员信息
   Boolean updatePerson(Person school);

   //查询某人员的详细信息
   Person selectPerson(Person school);

   //查询人员列表
   List<Person> selectAllPerson();

   //查询人员列表条数
   int selectCount();

   //查询人员列表以分页形式
   List<Person> pagePerson(HashMap<String, Object> map);

   //人员登录
   Person login(Person person);

   //修改密码
   Boolean updatePassword(Person person);





}
