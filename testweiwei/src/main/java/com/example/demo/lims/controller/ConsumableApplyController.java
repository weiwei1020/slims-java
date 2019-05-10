package com.example.demo.lims.controller;

import com.example.demo.lims.service.ConsumableApplyService;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/consumableApply")
public class ConsumableApplyController {

    @Autowired
    private ConsumableApplyService consumableApplyaseService;



    //添加领用申请
    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addConsumable(ConsumablePurchase consumablePurchase){
        return consumableApplyaseService.addConsumableApply(consumablePurchase);
    }

    //删除领用申请单
    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteConsumableApply(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(15);
        return consumableApplyaseService.deleteConsumableApply(consumablePurchase);
    }

    //修改领用申请单
    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateConsumableApply(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(14);
        consumablePurchase.setPurchaseConsumableId(1);
        return consumableApplyaseService.updateConsumableApply(consumablePurchase);
    }

    //查询单条领用申请单
    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectConsumableApply(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(14);
        return consumableApplyaseService.selectConsumableApply(consumablePurchase);
    }

    //查询所有领用申请单
    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllConsumableApply(){
        return consumableApplyaseService.selectAllConsumableApply();
    }

    //以分页形式显示领用申请单
    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageConsumablePurchase(ConsumablePurchase consumablePurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return consumableApplyaseService.pageConsumableApply(page,rows,consumablePurchase);
    }

    //通过领用申请单
    @ResponseBody
    @RequestMapping(value = "/purchaseAudit")
    public PageReturn purchaseAudit(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(12);
        return consumableApplyaseService.purchaseAudit(consumablePurchase);
    }

    //驳回领用申请单
    @ResponseBody
    @RequestMapping(value = "/purchaseReject")
    public PageReturn purchaseReject(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(12);
        return consumableApplyaseService.purchaseReject(consumablePurchase);
    }

    //出库领用申请单
    @ResponseBody
    @RequestMapping(value = "/purchaseOut")
    public PageReturn purchaseOut(ConsumablePurchase consumablePurchase){

        consumablePurchase.setPurchaseConsumableId(1);
        consumablePurchase.setPurchaseId(12);
        return consumableApplyaseService.purchaseOut(consumablePurchase);
    }


}
