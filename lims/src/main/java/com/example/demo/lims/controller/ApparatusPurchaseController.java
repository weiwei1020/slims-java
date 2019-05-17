package com.example.demo.lims.controller;

import com.example.demo.lims.service.ApparatusPurchaseService;
import com.example.demo.lims.service.ConsumablePurchaseService;
import com.example.demo.lims.vo.ApparatusPurchase;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
仪器预约管理
 */
@RestController()
@RequestMapping(value = "/apparatusPurchase")
public class ApparatusPurchaseController {

    @Autowired
    private ApparatusPurchaseService apparatusPurchaseService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addApparatusPurchase(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.addApparatusPurchase(apparatusPurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteApparatusPurchase(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.deleteApparatusPurchase(apparatusPurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateApparatusPurchase(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.updateApparatusPurchase(apparatusPurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectApparatusPurchase(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.selectApparatusPurchase(apparatusPurchase);
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllApparatusPurchase(){
        return apparatusPurchaseService.selectAllApparatusPurchase();
    }

    @RequestMapping("/pageDraft")
    @ResponseBody
    public Pagelims pageDraftApparatusPurchase(ApparatusPurchase apparatusPurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return apparatusPurchaseService.pageDraftApparatusPurchase(page,rows,apparatusPurchase);
    }
    /*个人预约单page*/
    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageApparatusPurchase(ApparatusPurchase apparatusPurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return apparatusPurchaseService.pageApparatusPurchase(page,rows,apparatusPurchase);
    }
    /*所有预约单page*/
    @RequestMapping("/apparatusPurchaseManage")
    @ResponseBody
    public Pagelims apparatusPurchaseManage(ApparatusPurchase apparatusPurchase, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return apparatusPurchaseService.apparatusPurchaseManage(page,rows,apparatusPurchase);
    }
/*通过*/
    @ResponseBody
    @RequestMapping(value = "/purchaseAudit")
    public PageReturn purchaseAudit(ApparatusPurchase apparatusPurchase){

        return apparatusPurchaseService.purchaseAudit(apparatusPurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/purchaseReject")
    public PageReturn purchaseReject(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.purchaseReject(apparatusPurchase);
    }

    @ResponseBody
    @RequestMapping(value = "/purchaseSubmit")
    public PageReturn purchaseSubmit(ApparatusPurchase apparatusPurchase){
        return apparatusPurchaseService.purchaseSubmit(apparatusPurchase);
    }
}
