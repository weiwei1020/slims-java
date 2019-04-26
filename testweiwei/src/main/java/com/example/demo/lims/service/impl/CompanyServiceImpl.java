package com.example.demo.lims.service.impl;

import com.example.demo.lims.vo.Company;
import com.example.demo.lims.mapper.CompanyMapper;
import com.example.demo.lims.service.CompanyService;
import com.example.demo.lims.vo.PageBean;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;


    @Override
    public PageReturn addCompany(Company company) {
        PageReturn pageReturn=new PageReturn();

        if (companyMapper.insertCompany(company) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;

    }

    @Override
    public PageReturn deleteCompany(Company company) {
        PageReturn pageReturn=new PageReturn();

        if (companyMapper.deleteCompany(company) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }

    @Override
    public PageReturn updateCompany(Company company) {
        PageReturn pageReturn=new PageReturn();

        if (companyMapper.updateCompany(company) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectCompany(Company company) {
        PageReturn pageReturn = new PageReturn();

        pageReturn.setData(companyMapper.selectCompany(company));
        if (companyMapper.selectCompany(company).getCompanyName() != null){
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectAllCompany(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(companyMapper.selectAllCompany());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageCompany(int currentPage, int pageSize, Company company) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Company> pageBean = new PageBean<Company>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = companyMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (company.getCompanyName()==null){
            company.setCompanyName("");
        }
        map.put("companyName",company.getCompanyName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Company> lists = companyMapper.pageCompany(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }




}
