package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Apparatus;
import com.example.demo.lims.vo.Consumable;
import com.example.demo.lims.vo.UpdateStock;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
仪器资产管理
 */
@Repository
public interface ApparatusMapper {
   //添加仪器资产
   Boolean insertApparatus(Apparatus apparatus);

   //删除仪器资产
   Boolean deleteApparatus(Apparatus apparatus);

   //修改仪器资产
   Boolean updateApparatus(Apparatus apparatus);

   //查询单条仪器资产
   Apparatus selectApparatus(Apparatus apparatus);

   //查询全部仪器资产
   List<Apparatus> selectAllApparatus();

   //查询仪器资产中列表的条数
   int selectCount();

   //分页查询仪器资产
   List<Apparatus> pageApparatus(HashMap<String, Object> map);


}
