package com.example.demo.lims.controller;

import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.service.TestService;
import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/apparatusSort")
public class ApparatusSortController {

    @Autowired
    private ApparatusSortService apparatusSortService;

    @RequestMapping(value = "/add")
    public PageReturn addApparatusSort(ApparatusSort apparatusSort){
        return apparatusSortService.addApparatusSort(apparatusSort);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteApparatusSort(ApparatusSort apparatusSort){

        return apparatusSortService.deleteApparatusSort(apparatusSort);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateApparatusSort(ApparatusSort apparatusSort){

    return apparatusSortService.updateApparatusSort(apparatusSort);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectApparatusSort(ApparatusSort apparatusSort){
        apparatusSort.setApparatusSortId(1);
        return apparatusSortService.selectApparatusSort(apparatusSort);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllApparatusSort(){
        return apparatusSortService.selectAllApparatusSort();
    }

    @RequestMapping("/page")
    public Pagelims pageTest(ApparatusSort apparatusSort, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return apparatusSortService.pageApparatusSort(page,rows,apparatusSort);
    }

}
