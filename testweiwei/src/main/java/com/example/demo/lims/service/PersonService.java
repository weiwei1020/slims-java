package com.example.demo.lims.service;

import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Person;
import com.example.demo.lims.vo.School;

public interface PersonService {
    PageReturn addPerson(Person person);

    PageReturn deletePerson(Person person);

    PageReturn updatePerson(Person person);

    PageReturn selectPerson(Person person);

    PageReturn selectAllPerson();

    Pagelims pagePerson(int currentPage, int pageSize, Person person);

}
