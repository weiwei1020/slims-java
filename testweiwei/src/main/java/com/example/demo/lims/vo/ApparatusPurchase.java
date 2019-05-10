package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;


//耗材订单
@Component
public class ApparatusPurchase extends Consumable{
    //耗材预约id
    private Integer id;
    //耗材预约-耗材id
    private Integer apparatusPurchaseApparatusId;
    //耗材预约人
    private String apparatusPurchasePerson;
    //耗材预约编号
    private Integer apparatusPurchaseNum;
    //耗材预约理由
    private String apparatusPurchaseReason;
    //耗材预约开始使用时间
    private String apparatusPurchaseCtime;
    //耗材预约结束使用时间
    private String apparatusPurchaseLtime;
    //耗材预约备注
    private String apparatusPurchaseRemark;
    //耗材预约状态，0草稿箱、1以提交、2以通过、3以驳回
    private Integer apparatusPurchaseStatus;
    //耗材预约单类型，0预约、1采购
    private Integer apparatusPurchaseType;



    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApparatusPurchaseApparatusId() {
        return apparatusPurchaseApparatusId;
    }

    public void setApparatusPurchaseApparatusId(Integer apparatusPurchaseApparatusId) {
        this.apparatusPurchaseApparatusId = apparatusPurchaseApparatusId;
    }

    public String getApparatusPurchasePerson() {
        return apparatusPurchasePerson;
    }

    public void setApparatusPurchasePerson(String apparatusPurchasePerson) {
        this.apparatusPurchasePerson = apparatusPurchasePerson;
    }

    public Integer getApparatusPurchaseNum() {
        return apparatusPurchaseNum;
    }

    public void setApparatusPurchaseNum(Integer apparatusPurchaseNum) {
        this.apparatusPurchaseNum = apparatusPurchaseNum;
    }

    public String getApparatusPurchaseReason() {
        return apparatusPurchaseReason;
    }

    public void setApparatusPurchaseReason(String apparatusPurchaseReason) {
        this.apparatusPurchaseReason = apparatusPurchaseReason;
    }

    public String getApparatusPurchaseCtime() {
        return apparatusPurchaseCtime;
    }

    public void setApparatusPurchaseCtime(String apparatusPurchaseCtime) {
        this.apparatusPurchaseCtime = apparatusPurchaseCtime;
    }

    public String getApparatusPurchaseLtime() {
        return apparatusPurchaseLtime;
    }

    public void setApparatusPurchaseLtime(String apparatusPurchaseLtime) {
        this.apparatusPurchaseLtime = apparatusPurchaseLtime;
    }

    public String getApparatusPurchaseRemark() {
        return apparatusPurchaseRemark;
    }

    public void setApparatusPurchaseRemark(String apparatusPurchaseRemark) {
        this.apparatusPurchaseRemark = apparatusPurchaseRemark;
    }

    public Integer getApparatusPurchaseStatus() {
        return apparatusPurchaseStatus;
    }

    public void setApparatusPurchaseStatus(Integer apparatusPurchaseStatus) {
        this.apparatusPurchaseStatus = apparatusPurchaseStatus;
    }

    public Integer getApparatusPurchaseType() {
        return apparatusPurchaseType;
    }

    public void setApparatusPurchaseType(Integer apparatusPurchaseType) {
        this.apparatusPurchaseType = apparatusPurchaseType;
    }


    @Override
    public String toString() {
        return "ApparatusPurchase{" +
                "id=" + id +
                ", apparatusPurchaseApparatusId=" + apparatusPurchaseApparatusId +
                ", apparatusPurchasePerson='" + apparatusPurchasePerson + '\'' +
                ", apparatusPurchaseNum=" + apparatusPurchaseNum +
                ", apparatusPurchaseReason='" + apparatusPurchaseReason + '\'' +
                ", apparatusPurchaseCtime='" + apparatusPurchaseCtime + '\'' +
                ", apparatusPurchaseLtime='" + apparatusPurchaseLtime + '\'' +
                ", apparatusPurchaseRemark='" + apparatusPurchaseRemark + '\'' +
                ", apparatusPurchaseStatus=" + apparatusPurchaseStatus +
                ", apparatusPurchaseType=" + apparatusPurchaseType +
                '}';
    }
}
