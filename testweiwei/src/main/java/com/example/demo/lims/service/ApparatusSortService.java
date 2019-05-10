package com.example.demo.lims.service;

import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Test;

public interface ApparatusSortService {
    PageReturn addApparatusSort(ApparatusSort apparatusSort);

    PageReturn deleteApparatusSort(ApparatusSort apparatusSort);

    PageReturn updateApparatusSort(ApparatusSort apparatusSort);

    PageReturn selectApparatusSort(ApparatusSort apparatusSort);

    PageReturn selectAllApparatusSort();

    Pagelims pageApparatusSort(int currentPage, int pageSize, ApparatusSort apparatusSort);


}
