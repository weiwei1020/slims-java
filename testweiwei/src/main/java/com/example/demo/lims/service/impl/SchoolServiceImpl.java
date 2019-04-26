package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.CompanyMapper;
import com.example.demo.lims.mapper.SchoolMapper;
import com.example.demo.lims.service.CompanyService;
import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;


    @Override
    public PageReturn addSchool(School school) {
        PageReturn pageReturn=new PageReturn();

        if (schoolMapper.insertSchool(school) == true){
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
    public PageReturn deleteSchool(School school) {
        PageReturn pageReturn=new PageReturn();

        if (schoolMapper.deleteSchool(school) == true){
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
    public PageReturn updateSchool(School school) {
        PageReturn pageReturn=new PageReturn();

        if (schoolMapper.updateSchool(school) == true){
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
    public PageReturn selectSchool(School school) {
        PageReturn pageReturn = new PageReturn();

        pageReturn.setData(schoolMapper.selectSchool(school));
        if (schoolMapper.selectSchool(school).getSchoolName() != null){
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
    public PageReturn selectAllSchool(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(schoolMapper.selectAllSchool());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageSchool(int currentPage, int pageSize, School school) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<School> pageBean = new PageBean<School>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = schoolMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (school.getSchoolName()==null){
            school.setSchoolName("");
        }
        if (school.getSchoolAddress()==null){
            school.setSchoolAddress("");
        }
        map.put("schoolName",school.getSchoolName());
        map.put("schoolAddress",school.getSchoolAddress());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<School> lists = schoolMapper.pageSchool(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }




}
