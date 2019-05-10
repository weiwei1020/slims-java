package com.example.demo.lims.service;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.ConsumableSort;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface ConsumableService {
    PageReturn addConsumable(Consumable consumable);

    PageReturn deleteConsumable(Consumable consumable);

    PageReturn updateConsumable(Consumable consumable);

    PageReturn selectConsumable(Consumable consumable);

    PageReturn selectAllConsumable();

    Pagelims pageConsumable(int currentPage, int pageSize, Consumable consumable);


}
