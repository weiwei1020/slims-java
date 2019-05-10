package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.ConsumablePurchase;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ConsumablePurchaseMapper {
   Boolean insertConsumablePurchase(ConsumablePurchase consumablePurchase);

   Boolean deleteConsumablePurchase(ConsumablePurchase consumablePurchase);

   Boolean updateConsumablePurchase(ConsumablePurchase consumablePurchase);

   ConsumablePurchase selectConsumablePurchase(ConsumablePurchase consumablePurchase);

   List<ConsumablePurchase> selectAllConsumablePurchase(int purchaseType);

   int selectCount();

   List<ConsumablePurchase> pageConsumablePurchase(HashMap<String, Object> map);

   Boolean purchaseAudit(ConsumablePurchase consumablePurchase);

   Boolean purchaseReject(ConsumablePurchase consumablePurchase);

   Boolean purchaseOut(ConsumablePurchase consumablePurchase);

}
