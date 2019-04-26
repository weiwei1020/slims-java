package com.example.demo.lims.service;

import com.example.demo.lims.vo.Company;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.School;

public interface SchoolService {
    PageReturn addSchool(School school);

    PageReturn deleteSchool(School school);

    PageReturn updateSchool(School school);

    PageReturn selectSchool(School school);

    PageReturn selectAllSchool();

    Pagelims pageSchool(int currentPage, int pageSize, School school);

}
