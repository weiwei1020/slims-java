package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ConsumableMapper;
import com.example.demo.lims.mapper.ConsumablePurchaseMapper;
import com.example.demo.lims.service.ConsumableApplyService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ConsumableApplyServiceImpl implements ConsumableApplyService {
    @Autowired
    private ConsumablePurchaseMapper consumablePurchaseMapper;
    @Autowired
    private ConsumableMapper consumableMapper;


    @Override
    public PageReturn addConsumableApply(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumablePurchase.setCtime(slimsTools.gainSystemTime());
        consumablePurchase.setPurchaseNumber("HC120"+slimsTools.gainOrderNumber());
        consumablePurchase.setPurchaseType(1);
        if (consumablePurchaseMapper.insertConsumablePurchase(consumablePurchase) == true){
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
    public PageReturn deleteConsumableApply(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();

        if (consumablePurchaseMapper.deleteConsumablePurchase(consumablePurchase) == true){
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
    public PageReturn updateConsumableApply(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumablePurchase.setCtime(slimsTools.gainSystemTime());
        if (consumablePurchaseMapper.updateConsumablePurchase(consumablePurchase) == true){
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
    public PageReturn selectConsumableApply(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn = new PageReturn();
        consumablePurchase.setPurchaseType(1);
        pageReturn.setData(consumablePurchaseMapper.selectConsumablePurchase(consumablePurchase));

        if (consumablePurchaseMapper.selectConsumablePurchase(consumablePurchase).getPurchaseId() != null){
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
    public PageReturn selectAllConsumableApply(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(consumablePurchaseMapper.selectAllConsumablePurchase(1));
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageConsumableApply(int currentPage, int pageSize, ConsumablePurchase consumablePurchase) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ConsumablePurchase> pageBean = new PageBean<ConsumablePurchase>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = consumablePurchaseMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (consumablePurchase.getReason()==null){
            consumablePurchase.setReason("");
        }
        if (consumablePurchase.getName()==null){
            consumablePurchase.setName("");
        }
        if (consumablePurchase.getNum()==null){
            consumablePurchase.setNum("");
        }
        if (consumablePurchase.getPurchasePerson()==null){
            consumablePurchase.setPurchasePerson("");
        }
        if (consumablePurchase.getStatus()==null){
            consumablePurchase.setStatus("");
        }
        map.put("status",consumablePurchase.getStatus());
        map.put("purchaseType",1);
        map.put("purchasePerson",consumablePurchase.getPurchasePerson());
        map.put("reason",consumablePurchase.getReason());
        map.put("num",consumablePurchase.getNum());
        map.put("name",consumablePurchase.getName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ConsumablePurchase> lists = consumablePurchaseMapper.pageConsumablePurchase(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

    @Override
    public Pagelims consumablePurchaseManage(int currentPage, int pageSize, ConsumablePurchase consumablePurchase) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ConsumablePurchase> pageBean = new PageBean<ConsumablePurchase>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = consumablePurchaseMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (consumablePurchase.getReason()==null){
            consumablePurchase.setReason("");
        }
        if (consumablePurchase.getName()==null){
            consumablePurchase.setName("");
        }
        if (consumablePurchase.getNum()==null){
            consumablePurchase.setNum("");
        }
        if (consumablePurchase.getPurchasePerson()==null){
            consumablePurchase.setPurchasePerson("");
        }
        if (consumablePurchase.getStatus()==null){
            consumablePurchase.setStatus("");
        }
        map.put("status",consumablePurchase.getStatus());
        map.put("purchaseType",1);
        map.put("purchasePerson",consumablePurchase.getPurchasePerson());
        map.put("reason",consumablePurchase.getReason());
        map.put("num",consumablePurchase.getNum());
        map.put("name",consumablePurchase.getName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ConsumablePurchase> lists = consumablePurchaseMapper.consumablePurchaseManage(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

    @Override
    public PageReturn purchaseAudit(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumablePurchase.setLtime(slimsTools.gainSystemTime());
        if (consumablePurchaseMapper.purchaseAudit(consumablePurchase) == true){
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
    public PageReturn purchaseReject(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        consumablePurchase.setLtime(slimsTools.gainSystemTime());
        if (consumablePurchaseMapper.purchaseReject(consumablePurchase) == true){
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
    public PageReturn purchaseOut(ConsumablePurchase consumablePurchase) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        Consumable consumable = new Consumable();
        UpdateStock updateStock = new UpdateStock();
        //写入出库时间
        consumablePurchase.setLtime(slimsTools.gainSystemTime());

        if (consumablePurchaseMapper.purchaseIn(consumablePurchase) == true){
                pageReturn.setData("0");
                pageReturn.setCode(1);
                pageReturn.setMsg("成功");
                pageReturn.setSuccess(true);
                //获取耗材的id
                Integer updateStockId=consumablePurchase.getId();
                //将耗材id传送给耗材的实体类当中
                consumable.setId(updateStockId);
                //获取当前采购某个耗材的数量
            Integer sumone = consumablePurchaseMapper.selectConsumablePurchase(consumablePurchase).getConsunmableStock();
                //计算库存量
            System.out.println(sumone);
            System.out.println(consumableMapper.selectConsumable(consumable).getStock());
                Integer sum = consumableMapper.selectConsumable(consumable).getStock()-sumone;

                //修改库存
                updateStock.setId(updateStockId);
            System.out.println(updateStockId);

                updateStock.setStock(sum);
            System.out.println(sum);

                if (consumableMapper.updateStock(updateStock)==true){
                    pageReturn.setData("0");
                    pageReturn.setCode(1);
                    pageReturn.setMsg("成功");
                    pageReturn.setSuccess(true);
                }else {
                    pageReturn.setData("1");
                    pageReturn.setCode(0);
                    pageReturn.setMsg("库存修改失败");
                    pageReturn.setSuccess(false);
            }
         }else {
        pageReturn.setData("1");
        pageReturn.setCode(0);
        pageReturn.setMsg("失败");
        pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


}
