package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.ApparatusPurchase;
import com.example.demo.lims.vo.ConsumablePurchase;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@WeiJie
仪器预约管理
 */
@Repository
public interface ApparatusPurchaseMapper {
   //添加仪器预约单
   Boolean insertApparatusPurchase(ApparatusPurchase apparatusPurchase);

   //删除仪器预约单
   Boolean deleteApparatusPurchase(ApparatusPurchase apparatusPurchase);

   //修改仪器预约单
   Boolean updateApparatusPurchase(ApparatusPurchase apparatusPurchase);

   //查询单条仪器预约单
   ApparatusPurchase selectApparatusPurchase(ApparatusPurchase apparatusPurchase);

   //查询仪器预约单列表
   List<ApparatusPurchase> selectAllApparatusPurchase();

   //查询数据库中预约单的条数，用于分页
   int selectCount();
   //查询草稿箱仪器预约单page
   List<ApparatusPurchase> pageDraftApparatusPurchase(HashMap<String, Object> map);

   //查询个人预约单page，（状态：以提交，已通过，以驳回）
   List<ApparatusPurchase> pageApparatusPurchase(HashMap<String, Object> map);

   //查询所有预约单page
   List<ApparatusPurchase> apparatusPurchaseManage(HashMap<String, Object> map);

   //通过
   Boolean purchaseAudit(ApparatusPurchase apparatusPurchase);

   //驳回
   Boolean purchaseReject(ApparatusPurchase apparatusPurchase);

   //提交
   Boolean purchaseSubmit(ApparatusPurchase apparatusPurchase);

}
