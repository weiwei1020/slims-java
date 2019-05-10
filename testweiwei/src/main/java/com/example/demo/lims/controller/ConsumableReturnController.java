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
        consumablePurchase.setPurchaseId(1);
        consumablePurchase.setPurchasePerson("jiangbo");
        return consumableReturnService.updateConsumableReturn(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectConsumableReturn(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
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
        consumablePurchase.setPurchaseId(16);
        return consumableReturnService.purchaseAudit(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseReject")
    public PageReturn purchaseReject(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(16);
        return consumableReturnService.purchaseReject(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseOut")
    public PageReturn purchaseOut(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        consumablePurchase.setPurchaseConsumableId(16);
        return consumableReturnService.purchaseOut(consumablePurchase);
    }


}
