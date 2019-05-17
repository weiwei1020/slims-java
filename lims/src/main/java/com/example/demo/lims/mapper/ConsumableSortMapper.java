package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.ConsumableSort;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@Weijie
耗材类别管理
 */
@Repository
public interface ConsumableSortMapper {
   //添加耗材类别
   Boolean insertConsumableSort(ConsumableSort consumableSort);

   //删除耗材类别
   Boolean deleteConsumableSort(ConsumableSort consumableSort);

   //修改耗材类别
   Boolean updateConsumableSort(ConsumableSort consumableSort);

   //查询某一条耗材类别详情
   ConsumableSort selectConsumableSort(ConsumableSort consumableSort);

   //查询耗材类别列表
   List<ConsumableSort> selectAllConsumableSort(ConsumableSort consumableSort);

   //查询耗材类别列表条数，用于分页显示
   int selectCount();

   //以分页形式查询耗材列表
   List<ConsumableSort> pageConsumableSort(HashMap<String, Object> map);

}
