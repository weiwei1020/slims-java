package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.PersonMapper;
import com.example.demo.lims.mapper.SchoolMapper;
import com.example.demo.lims.service.PersonService;
import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;


    @Override
    public PageReturn addPerson(Person person) {
        PageReturn pageReturn=new PageReturn();
        if(person.getPersonRoleName() == "管理员"){
            person.setPersonRole(0);
        }else {
            if (person.getPersonRoleName() == "老师"){
                person.setPersonRole(1);
            }else {
                person.setPersonRole(2);
            }
        }

        if (personMapper.insertPerson(person) == true){
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
    public PageReturn deletePerson(Person person) {
        PageReturn pageReturn=new PageReturn();

        if (personMapper.deletePerson(person) == true){
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
    public PageReturn updatePerson(Person person) {
        PageReturn pageReturn=new PageReturn();

        if (personMapper.updatePerson(person) == true){
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
    public PageReturn selectPerson(Person person) {
        PageReturn pageReturn = new PageReturn();

        pageReturn.setData(personMapper.selectPerson(person));
        if (personMapper.selectPerson(person).getPersonName() != null){
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
    public PageReturn selectAllPerson(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(personMapper.selectAllPerson());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }

    @Override
    public Pagelims pagePerson(int currentPage, int pageSize, Person person) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Person> pageBean = new PageBean<Person>();
        //封装当前页数
        pageBean.setPages(currentPage);
        //每页显示的数据
        pageBean.setSize(pageSize);
        //封装总记录数
        int totalCount = personMapper.selectCount();
        pageBean.setTotal(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (person.getPersonName()==null){
            person.setPersonName("");
        }

        map.put("personName",person.getPersonName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Person> lists = personMapper.pagePerson(map);
        pageBean.setRecords(lists);
        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

    @Override
    public PageReturn login(Person person) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(personMapper.login(person));
        if (personMapper.login(person) != null){
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setCode(0);
            pageReturn.setMsg("登录失败，请检查用户名和密码是否正确");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }

    @Override
    public PageReturn updatePassword(Person person) {
        PageReturn pageReturn = new PageReturn();
            if (personMapper.updatePassword(person) == true) {
                pageReturn.setData(true);
                pageReturn.setCode(1);
                pageReturn.setMsg("修改密码成功");
                pageReturn.setSuccess(true);
        } else {
                pageReturn.setCode(0);
                pageReturn.setMsg("用户信息错误");
                pageReturn.setSuccess(false);
            }
        return pageReturn;
    }
}
