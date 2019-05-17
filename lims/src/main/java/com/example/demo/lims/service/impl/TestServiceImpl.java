package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.SchoolMapper;
import com.example.demo.lims.mapper.TestMapper;
import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.service.TestService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;


    @Override
    public PageReturn addTest(Test test) {
        PageReturn pageReturn=new PageReturn();
        test.setTestState(0);

        if (testMapper.insertTest(test) == true){
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
    public PageReturn deleteTest(Test test) {
        PageReturn pageReturn=new PageReturn();

        if (testMapper.deleteTest(test) == true){
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
    public PageReturn updateTest(Test test) {
        PageReturn pageReturn=new PageReturn();
        test.setTestState(0);
        if (testMapper.updateTest(test) == true){
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
    public PageReturn selectTest(Test test) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(testMapper.selectTest(test));
        if (testMapper.selectTest(test).getTestName() != null){
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
    public PageReturn selectAllTest(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(testMapper.selectAllTest());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageTest(int currentPage, int pageSize, Test test) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Test> pageBean = new PageBean<Test>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = testMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (test.getTestName()==null){
            test.setTestName("");
        }
        if (test.getTestProjectId()==null){
            test.setTestProjectId(null);
        }
        map.put("testUname",test.getTestUname());
        map.put("testName",test.getTestName());
        map.put("testProjectId",test.getTestProjectId());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Test> lists = testMapper.pageTest(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

    @Override
    public PageReturn beginTest(Test test) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        test.setBeginDate(slimsTools.gainSystemTime());
        if (testMapper.beginTest(test) == true){
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
    public PageReturn pauseTest(Test test) {
        PageReturn pageReturn=new PageReturn();

        if (testMapper.pauseTest(test) == true){
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
    public PageReturn terminationTest(Test test) {
        PageReturn pageReturn=new PageReturn();

        if (testMapper.terminationTest(test) == true){
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
    public PageReturn endTest(Test test) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        test.setEndDate(slimsTools.gainSystemTime());
        if (testMapper.endTest(test) == true){
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
    public Pagelims testManage(int currentPage, int pageSize, Test test) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Test> pageBean = new PageBean<Test>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = testMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (test.getTestName()==null){
            test.setTestName("");
        }
        map.put("testUname",test.getTestUname());
        map.put("testName",test.getTestName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Test> lists = testMapper.testManage(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

}
