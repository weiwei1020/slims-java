package com.example.demo.lims.service;

import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface ConsumableApplyService {
    PageReturn addConsumableApply(ConsumablePurchase consumablePurchase);

    PageReturn deleteConsumableApply(ConsumablePurchase consumablePurchase);

    PageReturn updateConsumableApply(ConsumablePurchase consumablePurchase);

    PageReturn selectConsumableApply(ConsumablePurchase consumablePurchase);

    PageReturn selectAllConsumableApply();

    Pagelims pageConsumableApply(int currentPage, int pageSize, ConsumablePurchase consumablePurchase);

    Pagelims consumablePurchaseManage(int currentPage, int pageSize, ConsumablePurchase consumablePurchase);

    PageReturn purchaseAudit(ConsumablePurchase consumablePurchase);

    PageReturn purchaseReject(ConsumablePurchase consumablePurchase);

    PageReturn purchaseOut(ConsumablePurchase consumablePurchase);





}
