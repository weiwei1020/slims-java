package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.ConsumableSort;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ConsumableSortMapper {
   Boolean insertConsumableSort(ConsumableSort consumableSort);

   Boolean deleteConsumableSort(ConsumableSort consumableSort);

   Boolean updateConsumableSort(ConsumableSort consumableSort);

   ConsumableSort selectConsumableSort(ConsumableSort consumableSort);

   List<ConsumableSort> selectAllConsumableSort();

   int selectCount();

   List<ConsumableSort> pageConsumableSort(HashMap<String, Object> map);

}
