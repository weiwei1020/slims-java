package com.example.demo.lims.service;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

import java.util.List;

public interface ConsumablePurchaseService {
    PageReturn addConsumablePurchase(ConsumablePurchase consumablePurchase);

    PageReturn deleteConsumablePurchase(ConsumablePurchase consumablePurchase);

    PageReturn updateConsumablePurchase(ConsumablePurchase consumablePurchase);

    PageReturn selectConsumablePurchase(ConsumablePurchase consumablePurchase);

    PageReturn selectAllConsumablePurchase();

    Pagelims pageConsumablePurchase(int currentPage, int pageSize, ConsumablePurchase consumablePurchase);

    PageReturn purchaseAudit(ConsumablePurchase consumablePurchase);

    PageReturn purchaseReject(ConsumablePurchase consumablePurchase);

    PageReturn purchaseIn(ConsumablePurchase consumablePurchase);

    Pagelims consumablesPurchaseStatistics();




}
