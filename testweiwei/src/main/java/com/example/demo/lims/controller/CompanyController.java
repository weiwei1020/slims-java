package com.example.demo.lims.controller;

import com.example.demo.lims.vo.Company;
import com.example.demo.lims.service.CompanyService;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/add")
    public PageReturn addCompany(Company company){
        return companyService.addCompany(company);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteCompany(Company company){
        return companyService.deleteCompany(company);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateCompany(Company company){
        return companyService.updateCompany(company);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectCompany(Company company){
        return companyService.selectCompany(company);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllCompany(){
        return companyService.selectAllCompany();
    }

    @RequestMapping("/page")
    public Pagelims pageCompany(Company company, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        return companyService.pageCompany(page,rows,company);
    }



}
