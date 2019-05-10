package com.example.demo.lims.controller;

import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.service.ConsumableSortService;
import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.ConsumableSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/consumableSort")
public class ConsumableSortController {

    @Autowired
    private ConsumableSortService consumableSortService;

    @RequestMapping(value = "/add")
    public PageReturn addConsumableSort(ConsumableSort consumableSort){
        return consumableSortService.addConsumableSort(consumableSort);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteConsumableSort(ConsumableSort consumableSort){
        consumableSort.setConsumableSortId(3);

        return consumableSortService.deleteConsumableSort(consumableSort);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateApparatusSort(ConsumableSort consumableSort){

        consumableSort.setConsumableSortId(1);
        consumableSort.setConsumableSortName("sdfghjk");
    return consumableSortService.updateConsumableSort(consumableSort);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectConsumableSort(ConsumableSort consumableSort){
        consumableSort.setConsumableSortId(1);
        return consumableSortService.selectConsumableSort(consumableSort);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllConsumableSort(){
        return consumableSortService.selectAllConsumableSort();
    }

    @RequestMapping("/page")
    public Pagelims pageTest(ConsumableSort consumableSort, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return consumableSortService.pageConsumableSort(page,rows,consumableSort);
    }

}
