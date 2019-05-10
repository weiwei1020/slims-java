package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ApparatusSortMapper;
import com.example.demo.lims.mapper.TestMapper;
import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.service.TestService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ApparatusSortServiceImpl implements ApparatusSortService {
    @Autowired
    private ApparatusSortMapper apparatusSortMapper;


    @Override
    public PageReturn addApparatusSort(ApparatusSort apparatusSort) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        apparatusSort.setApparatusSortNumber(slimsTools.gainOrderNumber());

        if (apparatusSortMapper.insertApparatusSort(apparatusSort) == true){
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
    public PageReturn deleteApparatusSort(ApparatusSort apparatusSort) {
        PageReturn pageReturn=new PageReturn();

        if (apparatusSortMapper.deleteApparatusSort(apparatusSort) == true){
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
    public PageReturn updateApparatusSort(ApparatusSort apparatusSort) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusSortMapper.updateApparatusSort(apparatusSort) == true){
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
    public PageReturn selectApparatusSort(ApparatusSort apparatusSort) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(apparatusSortMapper.selectApparatusSort(apparatusSort));
        if (apparatusSortMapper.selectApparatusSort(apparatusSort).getApparatusSortName() != null){
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
    public PageReturn selectAllApparatusSort(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(apparatusSortMapper.selectAllApparatusSort());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageApparatusSort(int currentPage, int pageSize, ApparatusSort apparatusSort) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ApparatusSort> pageBean = new PageBean<ApparatusSort>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = apparatusSortMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (apparatusSort.getApparatusSortName()==null){
            apparatusSort.setApparatusSortName("");
        }
        map.put("apparatusSortName",apparatusSort.getApparatusSortName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ApparatusSort> lists = apparatusSortMapper.pageApparatusSort(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }


}
