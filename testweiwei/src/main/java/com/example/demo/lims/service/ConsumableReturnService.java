package com.example.demo.lims.service;

import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface ConsumableReturnService {
    PageReturn addConsumableReturn(ConsumablePurchase consumablePurchase);

    PageReturn deleteConsumableReturn(ConsumablePurchase consumablePurchase);

    PageReturn updateConsumableReturn(ConsumablePurchase consumablePurchase);

    PageReturn selectConsumableReturn(ConsumablePurchase consumablePurchase);

    PageReturn selectAllConsumableReturn();

    Pagelims pageConsumableReturn(int currentPage, int pageSize, ConsumablePurchase consumablePurchase);

    PageReturn purchaseAudit(ConsumablePurchase consumablePurchase);

    PageReturn purchaseReject(ConsumablePurchase consumablePurchase);

    PageReturn purchaseOut(ConsumablePurchase consumablePurchase);





}
