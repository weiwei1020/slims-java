package com.example.demo.lims.controller;

import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.service.TestService;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.School;
import com.example.demo.lims.vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/add")
    public PageReturn addTest(Test test){
        test.setTestName("bv");
        return testService.addTest(test);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteTest(Test test){
        return testService.deleteTest(test);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateTest(Test test){
    return testService.updateTest(test);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectTest(Test test){
        return testService.selectTest(test);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllTest(){
        return testService.selectAllTest();
    }

    @RequestMapping("/page")
    public Pagelims pageTest(Test test, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return testService.pageTest(page,rows,test);
    }

    @RequestMapping(value = "/beginTest")
    public PageReturn beginTest(Test test){
        return testService.beginTest(test);
    }

    @RequestMapping(value = "/pauseTest")
    public PageReturn pauseTest(Test test){
        return testService.pauseTest(test);
    }

    @RequestMapping(value = "/terminationTest")
    public PageReturn terminationTest(Test test){
        return testService.terminationTest(test);
    }

    @RequestMapping(value = "/endTest")
    public PageReturn endTest(Test test){
        return testService.endTest(test);
    }


}
