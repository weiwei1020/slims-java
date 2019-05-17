package com.example.demo.lims.controller;

import com.example.demo.lims.service.ConsumablePurchaseService;
import com.example.demo.lims.service.ConsumableReturnService;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
耗材归还管理
 */
@RestController()
@RequestMapping(value = "/consumableReturn")
public class ConsumableReturnController {

    @Autowired
    private ConsumableReturnService consumableReturnService;



    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addConsumableReturn(ConsumablePurchase consumablePurchase){
        return consumableReturnService.addConsumableReturn(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteConsumableReturn(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(18);
        return consumableReturnService.deleteConsumableReturn(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateConsumableReturn(ConsumablePurchase consumablePurchase){
        return consumableReturnService.updateConsumableReturn(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectConsumableReturn(ConsumablePurchase consumablePurchase){
        return consumableReturnService.selectConsumableReturn(consumablePurchase);
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllConsumableReturn(){
        return consumableReturnService.selectAllConsumableReturn();
    }


    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageConsumableReturn(ConsumablePurchase consumablePurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return consumableReturnService.pageConsumableReturn(page,rows,consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseAudit")
    public PageReturn purchaseAudit(ConsumablePurchase consumablePurchase){
        return consumableReturnService.purchaseAudit(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseReject")
    public PageReturn purchaseReject(ConsumablePurchase consumablePurchase){
        return consumableReturnService.purchaseReject(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseOut")
    public PageReturn purchaseOut(ConsumablePurchase consumablePurchase){
        return consumableReturnService.purchaseOut(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/useUp")
    public PageReturn useUpConsumable(ConsumablePurchase consumablePurchase){
        return consumableReturnService.useUpConsumable(consumablePurchase);
    }

}
