package com.example.demo.lims.service;

import com.example.demo.lims.vo.ApparatusPurchase;
import com.example.demo.lims.vo.ConsumablePurchase;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;

public interface ApparatusPurchaseService {
    PageReturn addApparatusPurchase(ApparatusPurchase apparatusPurchase);

    PageReturn deleteApparatusPurchase(ApparatusPurchase apparatusPurchase);

    PageReturn updateApparatusPurchase(ApparatusPurchase apparatusPurchase);

    PageReturn selectApparatusPurchase(ApparatusPurchase apparatusPurchase);

    PageReturn selectAllApparatusPurchase();

    Pagelims pageDraftApparatusPurchase(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase);

    Pagelims pageApparatusPurchase(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase);

    Pagelims apparatusPurchaseManage(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase);


    PageReturn purchaseAudit(ApparatusPurchase apparatusPurchase);

    PageReturn purchaseReject(ApparatusPurchase apparatusPurchase);

    PageReturn purchaseSubmit(ApparatusPurchase apparatusPurchase);





}
