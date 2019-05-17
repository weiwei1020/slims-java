package com.example.demo.lims.controller;

import com.example.demo.lims.service.ApparatusService;
import com.example.demo.lims.service.ApparatusSortService;
import com.example.demo.lims.vo.Apparatus;
import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
仪器资产管理
 */
@RestController()
@RequestMapping(value = "/apparatus")
public class ApparatusController {

    @Autowired
    private ApparatusService apparatusService;

    @RequestMapping(value = "/add")
    public PageReturn addApparatus(Apparatus apparatus){
        return apparatusService.addApparatus(apparatus);
    }

    @RequestMapping(value = "/delete")
    public PageReturn deleteApparatus(Apparatus apparatus){
        return apparatusService.deleteApparatus(apparatus);
    }

    @RequestMapping(value = "/update")
    public PageReturn updateApparatus(Apparatus apparatus){
    return apparatusService.updateApparatus(apparatus);
    }

    @RequestMapping(value = "/select")
    public PageReturn selectApparatus(Apparatus apparatus){
        return apparatusService.selectApparatus(apparatus);
    }

    @RequestMapping("/selectAll")
    public PageReturn selectAllApparatus(){
        return apparatusService.selectAllApparatus();
    }

    @RequestMapping("/page")
    public Pagelims pageTest(Apparatus apparatus, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return apparatusService.pageApparatus(page,rows,apparatus);
    }

}
