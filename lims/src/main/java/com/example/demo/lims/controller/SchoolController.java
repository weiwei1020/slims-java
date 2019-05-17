package com.example.demo.lims.controller;

import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
学校管理
 */
@RestController()
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/add")
    public PageReturn addSchool(School school){
        return schoolService.addSchool(school);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteSchool(School school){
        school.setSchoolId(1);
        return schoolService.deleteSchool(school);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateSchool(School school){
        return schoolService.updateSchool(school);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectSchool(School school){
        return schoolService.selectSchool(school);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllSchool(){
        return schoolService.selectAllSchool();
    }

    @RequestMapping("/page")
    public Pagelims pageSchool(School school, Integer page, Integer rows ){
        if (page == null){
            page=2;
        }
        if (rows==null){
            rows=20;
        }
        return schoolService.pageSchool(page,rows,school);
    }



}
