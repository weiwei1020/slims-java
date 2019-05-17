package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ApparatusSortMapper;
import com.example.demo.lims.mapper.ConsumableSortMapper;
import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.service.ConsumableSortService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ConsumableSortServiceImpl implements ConsumableSortService {
    @Autowired
    private ConsumableSortMapper consumableSortMapper;


    @Override
    public PageReturn addConsumableSort(ConsumableSort consumableSort) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumableSort.setConsumableSortNumber("C"+slimsTools.gainOrderNumber());

        if (consumableSortMapper.insertConsumableSort(consumableSort) == true){
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
    public PageReturn deleteConsumableSort(ConsumableSort consumableSort) {
        PageReturn pageReturn=new PageReturn();

        if (consumableSortMapper.deleteConsumableSort(consumableSort) == true){
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
    public PageReturn updateConsumableSort(ConsumableSort consumableSort) {
        PageReturn pageReturn=new PageReturn();
        if (consumableSortMapper.updateConsumableSort(consumableSort) == true){
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
    public PageReturn selectConsumableSort(ConsumableSort consumableSort) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(consumableSortMapper.selectConsumableSort(consumableSort));
        if (consumableSortMapper.selectConsumableSort(consumableSort).getConsumableSortName() != null){
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
    public PageReturn selectAllConsumableSort(ConsumableSort consumableSort){
        PageReturn pageReturn=new PageReturn();
        if (consumableSort.getConsumableSortName()==null){
            consumableSort.setConsumableSortName("");
        }
        pageReturn.setCode(1);
        pageReturn.setData(consumableSortMapper.selectAllConsumableSort(consumableSort));
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageConsumableSort(int currentPage, int pageSize, ConsumableSort consumableSort) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ConsumableSort> pageBean = new PageBean<ConsumableSort>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = consumableSortMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (consumableSort.getConsumableSortName()==null){
            consumableSort.setConsumableSortName("");
        }
        map.put("consumableSortName",consumableSort.getConsumableSortName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ConsumableSort> lists = consumableSortMapper.pageConsumableSort(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);


        return pageCompany;
    }


}
