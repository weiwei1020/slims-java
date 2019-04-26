package com.example.demo.lims.service;

import com.example.demo.lims.vo.Company;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface CompanyService {
    PageReturn addCompany(Company company);

    PageReturn deleteCompany(Company company);

    PageReturn updateCompany(Company company);

    PageReturn selectCompany(Company company);

    PageReturn selectAllCompany();

    Pagelims pageCompany(int currentPage, int pageSize, Company company);

}
