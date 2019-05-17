package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.Test;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
耗材类别管理
 */
@Repository
public interface ApparatusSortMapper {
   //添加耗材类别
   Boolean insertApparatusSort(ApparatusSort apparatusSort);

   //删除耗材类别
   Boolean deleteApparatusSort(ApparatusSort apparatusSort);

   //修改耗材类别
   Boolean updateApparatusSort(ApparatusSort apparatusSort);

   //查询单条耗材类别信息
   ApparatusSort selectApparatusSort(ApparatusSort apparatusSort);

   //查询耗材类别列表
   List<ApparatusSort> selectAllApparatusSort(ApparatusSort apparatusSort);

   //查询耗材类别条数，用于页面分页
   int selectCount();

   //查询所有耗材列表，以分页形式显示
   List<ApparatusSort> pageApparatusSort(HashMap<String, Object> map);

}
