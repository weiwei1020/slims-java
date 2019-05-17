package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ApparatusMapper;
import com.example.demo.lims.mapper.ApparatusSortMapper;
import com.example.demo.lims.service.ApparatusService;
import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
仪器资产管理
 */
@Service
@Transactional
public class ApparatusServiceImpl implements ApparatusService {
    @Autowired
    private ApparatusMapper apparatusMapper;


    @Override
    public PageReturn addApparatus(Apparatus apparatus) {
        PageReturn pageReturn=new PageReturn();
        //生成仪器编码以YQ开头+当时的系统时间+4位随机数字
        SlimsTools slimsTools = new SlimsTools();
        apparatus.setApparatusNum("YQ"+slimsTools.gainOrderNumber());
        //判断插入数据是否成功
        if (apparatusMapper.insertApparatus(apparatus) == true){
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
    public PageReturn deleteApparatus(Apparatus apparatus) {
        PageReturn pageReturn=new PageReturn();
        //判断删除数据是否成功
        if (apparatusMapper.deleteApparatus(apparatus) == true){
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
    public PageReturn updateApparatus(Apparatus apparatus) {
        PageReturn pageReturn=new PageReturn();
        //判断修改数据是否成功
        if (apparatusMapper.updateApparatus(apparatus) == true){
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
    public PageReturn selectApparatus(Apparatus apparatus) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(apparatusMapper.selectApparatus(apparatus));
        //判断查询的数据是否是非空数据
        if (apparatusMapper.selectApparatus(apparatus).getApparatusName() != null){
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
    public PageReturn selectAllApparatus(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(apparatusMapper.selectAllApparatus());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageApparatus(int currentPage, int pageSize, Apparatus apparatus) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Apparatus> pageBean = new PageBean<Apparatus>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据条数
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = apparatusMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        //模糊搜索时，当模糊搜索没有任何条件时，则为空
        if (apparatus.getApparatusName()==null){
            apparatus.setApparatusName("");
        }
        if (apparatus.getApparatusSortName()==null){
            apparatus.setApparatusSortName("");
        }
        //以HashMap的方式向xml中传输
        map.put("apparatusName",apparatus.getApparatusName());
        map.put("apparatusSortName",apparatus.getApparatusSortName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Apparatus> lists = apparatusMapper.pageApparatus(map);
        pageBean.setRecords(lists);
        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }


}
