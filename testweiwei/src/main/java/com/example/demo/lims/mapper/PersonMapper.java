package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Person;
import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface PersonMapper {
   Boolean insertPerson(Person school);

   Boolean deletePerson(Person school);

   Boolean updatePerson(Person school);

   Person selectPerson(Person school);

   List<Person> selectAllPerson();

   int selectCount();

   List<Person> pagePerson(HashMap<String, Object> map);


}
