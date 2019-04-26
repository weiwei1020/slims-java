package com.example.demo.lims.service;

import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.School;
import com.example.demo.lims.vo.Test;

public interface TestService {
    PageReturn addTest(Test test);

    PageReturn deleteTest(Test test);

    PageReturn updateTest(Test test);

    PageReturn selectTest(Test test);

    PageReturn selectAllTest();

    Pagelims pageTest(int currentPage, int pageSize, Test test);

    PageReturn beginTest(Test test);

    PageReturn pauseTest(Test test);

    PageReturn terminationTest(Test test);

    PageReturn endTest(Test test);

}
