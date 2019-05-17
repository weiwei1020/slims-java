package com.example.demo.lims.service;

import com.example.demo.lims.vo.Apparatus;
import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

/*
@WeiJie
仪器资产管理
 */
public interface ApparatusService {
    PageReturn addApparatus(Apparatus apparatus);

    PageReturn deleteApparatus(Apparatus apparatus);

    PageReturn updateApparatus(Apparatus apparatus);

    PageReturn selectApparatus(Apparatus apparatus);

    PageReturn selectAllApparatus();

    Pagelims pageApparatus(int currentPage, int pageSize, Apparatus apparatus);


}
