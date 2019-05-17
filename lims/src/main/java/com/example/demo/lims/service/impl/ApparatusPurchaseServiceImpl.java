package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ApparatusPurchaseMapper;
import com.example.demo.lims.mapper.ConsumableMapper;
import com.example.demo.lims.mapper.ConsumablePurchaseMapper;
import com.example.demo.lims.service.ApparatusPurchaseService;
import com.example.demo.lims.service.ConsumablePurchaseService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ApparatusPurchaseServiceImpl implements ApparatusPurchaseService {
    @Autowired
    private ApparatusPurchaseMapper apparatusPurchaseMapper;


    @Override
    public PageReturn addApparatusPurchase(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusPurchaseMapper.insertApparatusPurchase(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;

    }

    @Override
    public PageReturn deleteApparatusPurchase(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();

        if (apparatusPurchaseMapper.deleteApparatusPurchase(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }

    @Override
    public PageReturn updateApparatusPurchase(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusPurchaseMapper.updateApparatusPurchase(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectApparatusPurchase(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn = new PageReturn();
        pageReturn.setData(apparatusPurchaseMapper.selectApparatusPurchase(apparatusPurchase));
        if (apparatusPurchaseMapper.selectApparatusPurchase(apparatusPurchase).getApparatusPurchaseAuditPerson() != null){
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectAllApparatusPurchase(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(apparatusPurchaseMapper.selectAllApparatusPurchase());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }

    @Override
    public Pagelims pageDraftApparatusPurchase(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ApparatusPurchase> pageBean = new PageBean<ApparatusPurchase>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = apparatusPurchaseMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (apparatusPurchase.getApparatusName()==null){
            apparatusPurchase.setApparatusName("");
        }

        map.put("apparatusPurchasePersonId",apparatusPurchase.getApparatusPurchasePersonId());
        map.put("apparatusName",apparatusPurchase.getApparatusName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ApparatusPurchase> lists = apparatusPurchaseMapper.pageDraftApparatusPurchase(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }

/*个人预约单page*/
    @Override
    public Pagelims pageApparatusPurchase(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ApparatusPurchase> pageBean = new PageBean<ApparatusPurchase>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = apparatusPurchaseMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (apparatusPurchase.getApparatusName()==null){
            apparatusPurchase.setApparatusName("");
        }
        map.put("apparatusPurchasePersonId",apparatusPurchase.getApparatusPurchasePersonId());
        map.put("apparatusName",apparatusPurchase.getApparatusName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ApparatusPurchase> lists = apparatusPurchaseMapper.pageApparatusPurchase(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }
    //所有预约单page
    @Override
    public Pagelims apparatusPurchaseManage(int currentPage, int pageSize, ApparatusPurchase apparatusPurchase) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<ApparatusPurchase> pageBean = new PageBean<ApparatusPurchase>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = apparatusPurchaseMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (apparatusPurchase.getApparatusName()==null){
            apparatusPurchase.setApparatusName("");
        }

        map.put("apparatusName",apparatusPurchase.getApparatusName());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<ApparatusPurchase> lists = apparatusPurchaseMapper.apparatusPurchaseManage(map);
        pageBean.setRecords(lists);

        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);

        return pageCompany;
    }
//预约通过
    @Override
    public PageReturn purchaseAudit(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusPurchaseMapper.purchaseAudit(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }
//驳回
    @Override
    public PageReturn purchaseReject(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusPurchaseMapper.purchaseReject(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }
//预约单提交
    @Override
    public PageReturn purchaseSubmit(ApparatusPurchase apparatusPurchase) {
        PageReturn pageReturn=new PageReturn();
        if (apparatusPurchaseMapper.purchaseSubmit(apparatusPurchase) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


}
