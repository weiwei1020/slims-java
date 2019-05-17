package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.ConsumablePurchase;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
耗材单
0采购、1领用、2归还
 */
@Repository
public interface ConsumablePurchaseMapper {

   //添加耗材单
   Boolean insertConsumablePurchase(ConsumablePurchase consumablePurchase);

   //删除耗材单
   Boolean deleteConsumablePurchase(ConsumablePurchase consumablePurchase);

   //修改耗材单
   Boolean updateConsumablePurchase(ConsumablePurchase consumablePurchase);

   //查询单条耗材单
   ConsumablePurchase selectConsumablePurchase(ConsumablePurchase consumablePurchase);

   //查询耗材单列表
   List<ConsumablePurchase> selectAllConsumablePurchase(int purchaseType);

   //查询耗材单列表的条数，用于分页使用
   int selectCount();

   //查询申请耗材单，以分页形式显示
   List<ConsumablePurchase> pageConsumablePurchase(HashMap<String, Object> map);

   //查询审批耗材单，包含待审批，以审批，以驳回，以出库或以入库
   List<ConsumablePurchase> consumablePurchaseManage(HashMap<String, Object> map);

   //通过耗材单
   Boolean purchaseAudit(ConsumablePurchase consumablePurchase);

   //驳回耗材单
   Boolean purchaseReject(ConsumablePurchase consumablePurchase);

   //出库或入库耗材单
   Boolean purchaseIn(ConsumablePurchase consumablePurchase);

   //耗材以用尽，耗材使用记录-耗材耗材用尽（耗材归还）
   Boolean useUpConsumable(ConsumablePurchase consumablePurchase);

   //添加归还耗材单
   Boolean insertConsumableReturn(ConsumablePurchase consumablePurchase);

   //耗材采购统计
   ConsumablePurchase consumablesPurchaseStatistics(Consumable consumable);

   //耗材金额统计

}
