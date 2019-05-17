package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.UpdateStock;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
耗材资产管理
 */
@Repository
public interface ConsumableMapper {
   //添加耗材
   Boolean insertConsumable(Consumable consumable);

   //删除耗材
   Boolean deleteConsumable(Consumable consumable);

   //修改耗材
   Boolean updateConsumable(Consumable consumable);

   //查询一条耗材详情
   Consumable selectConsumable(Consumable consumable);

   //查询耗材列表
   List<Consumable> selectAllConsumable();

   //查询耗材列表的条数，用于分页
   int selectCount();

   //以分页形式查询耗材列表
   List<Consumable> pageConsumable(HashMap<String, Object> map);

   //修改耗材库存量
   Boolean updateStock(UpdateStock updateStock);

   //查询某个耗材的库存量，用与后面的采购入库，领用出库，归还入库
   Consumable selectStock(Consumable consumable);


}
