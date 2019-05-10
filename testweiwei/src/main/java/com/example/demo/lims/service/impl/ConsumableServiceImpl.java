package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ConsumableMapper;
import com.example.demo.lims.mapper.ConsumableSortMapper;
import com.example.demo.lims.service.ConsumableService;
import com.example.demo.lims.service.ConsumableSortService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ConsumableServiceImpl implements ConsumableService {
    @Autowired
    private ConsumableMapper consumableMapper;


    @Override
    public PageReturn addConsumable(Consumable consumable) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumable.setNum(slimsTools.gainOrderNumber());

        if (consumableMapper.insertConsumable(consumable) == true){
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
    public PageReturn deleteConsumable(Consumable consumable) {
        PageReturn pageReturn=new PageReturn();

        if (consumableMapper.deleteConsumable(consumable) == true){
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
    public PageReturn updateConsumable(Consumable consumable) {
        PageReturn pageReturn=new PageReturn();
        if (consumableMapper.updateConsumable(consumable) == true){
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
    public PageReturn selectConsumable(Consumable consumable) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(consumableMapper.selectConsumable(consumable));
        if (consumableMapper.selectConsumable(consumable).getName() != null){
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
    public PageReturn selectAllConsumable(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(consumableMapper.selectAllConsumable());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageConsumable(int currentPage, int pageSize, Consumable consumable) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Consumable> pageBean = new PageBean<Consumable>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = consumableMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (consumable.getNum()==null){
            consumable.setNum("");
        }
        if (consumable.getName()==null){
            consumable.setName("");
        }
        map.put("num",consumable.getNum());
        map.put("name",consumable.getName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Consumable> lists = consumableMapper.pageConsumable(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }


}
