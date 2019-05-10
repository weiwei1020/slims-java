package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.UpdateStock;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ConsumableMapper {
   Boolean insertConsumable(Consumable consumable);

   Boolean deleteConsumable(Consumable consumable);

   Boolean updateConsumable(Consumable consumable);

   Consumable selectConsumable(Consumable consumable);

   List<Consumable> selectAllConsumable();

   int selectCount();

   List<Consumable> pageConsumable(HashMap<String, Object> map);

   Boolean updateStock(UpdateStock updateStock);

   Consumable selectStock(Consumable consumable);


}
