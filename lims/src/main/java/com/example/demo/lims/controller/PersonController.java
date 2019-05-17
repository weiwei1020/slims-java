package com.example.demo.lims.controller;

import com.example.demo.lims.service.PersonService;
import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Person;
import com.example.demo.lims.vo.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
人员管理
 */
@RestController()
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/add")
    public PageReturn addPerson(Person person){
        return personService.addPerson(person);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deletePerson(Person person){
        return personService.deletePerson(person);
    }

    @RequestMapping(value = "/update")
    public PageReturn updatePerson(Person person){
        return personService.updatePerson(person);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectPerson(Person person){
        return personService.selectPerson(person);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllPerson(){
        return personService.selectAllPerson();
    }

    @RequestMapping("/page")
    public Pagelims pagePerson(Person person, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return personService.pagePerson(page,rows,person);
    }

    @RequestMapping(value = "/login")
    public PageReturn login(Person person){
        return personService.login(person);
    }

    @RequestMapping(value = "/updatePassword")
    public PageReturn updatePassword(Person person){
        return personService.updatePassword(person);
    }


}
