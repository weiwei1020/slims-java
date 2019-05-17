package com.example.demo.lims.controller;

import com.example.demo.lims.mapper.ConsumableMapper;
import com.example.demo.lims.mapper.ConsumableSortMapper;
import com.example.demo.lims.service.ConsumableService;
import com.example.demo.lims.service.ProjectService;
import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
@WieJie
耗材资产管理
 */
@RestController()
@RequestMapping(value = "/consumable")
public class ConsumableController {

    @Autowired
    private ConsumableService consumableService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addConsumable(Consumable consumable){
        return consumableService.addConsumable(consumable);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteConsumable(Consumable consumable){

        return consumableService.deleteConsumable(consumable);
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateConsumable(Consumable consumable){

        return consumableService.updateConsumable(consumable);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectConsumable(Consumable consumable){

        return consumableService.selectConsumable(consumable);
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllConsumable(){
        return consumableService.selectAllConsumable();
    }


    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageConsumable(Consumable consumable, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return consumableService.pageConsumable(page,rows,consumable);
    }



}
