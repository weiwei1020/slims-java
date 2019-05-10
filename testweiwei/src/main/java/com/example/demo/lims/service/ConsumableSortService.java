package com.example.demo.lims.service;

import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.ConsumableSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface ConsumableSortService {
    PageReturn addConsumableSort(ConsumableSort consumableSort);

    PageReturn deleteConsumableSort(ConsumableSort consumableSort);

    PageReturn updateConsumableSort(ConsumableSort consumableSort);

    PageReturn selectConsumableSort(ConsumableSort consumableSort);

    PageReturn selectAllConsumableSort();

    Pagelims pageConsumableSort(int currentPage, int pageSize, ConsumableSort consumableSort);


}
