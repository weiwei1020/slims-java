package com.example.demo.lims.controller;

import com.example.demo.lims.service.ConsumablePurchaseService;
import com.example.demo.lims.service.ConsumableService;
import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/consumablePurchase")
public class ConsumablePurchaseController {

    @Autowired
    private ConsumablePurchaseService consumablePurchaseService;



    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addConsumable(ConsumablePurchase consumablePurchase){
        return consumablePurchaseService.addConsumablePurchase(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteConsumablePurchase(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(3);
        return consumablePurchaseService.deleteConsumablePurchase(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateConsumablePurchase(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        return consumablePurchaseService.updateConsumablePurchase(consumablePurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectConsumablePurchase(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        return consumablePurchaseService.selectConsumablePurchase(consumablePurchase);
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllConsumablePurchase(){
        return consumablePurchaseService.selectAllConsumablePurchase();
    }


    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageConsumablePurchase(ConsumablePurchase consumablePurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return consumablePurchaseService.pageConsumablePurchase(page,rows,consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseAudit")
    public PageReturn purchaseAudit(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        return consumablePurchaseService.purchaseAudit(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseReject")
    public PageReturn purchaseReject(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        return consumablePurchaseService.purchaseReject(consumablePurchase);
    }


    @ResponseBody
    @RequestMapping(value = "/purchaseOut")
    public PageReturn purchaseOut(ConsumablePurchase consumablePurchase){
        consumablePurchase.setPurchaseId(1);
        consumablePurchase.setPurchaseConsumableId(12);
        return consumablePurchaseService.purchaseOut(consumablePurchase);
    }


}
