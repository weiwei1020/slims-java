package com.example.demo.lims.vo;


import org.springframework.stereotype.Component;

/*
@WeiJie
仪器预约
 */
@Component
public class ApparatusPurchase extends Apparatus{
    //仪器预约id
    private Integer id;

    //仪器预约-耗材id
    private Integer apparatusPurchaseApparatusId;

    //仪器预约-预约人ID
    private Integer apparatusPurchasePersonId;

    //仪器预约人
    private String apparatusPurchasePerson;

    //仪器预约审批人id
    private String apparatusPurchaseAuditPersonId;

    //仪器预约审批人
    private String apparatusPurchaseAuditPerson;

    //仪器预约理由
    private String apparatusPurchaseReason;

    //仪器预约开始使用时间
    private String apparatusPurchaseCtime;

    //仪器预约结束使用时间
    private String apparatusPurchaseLtime;

    //仪器预约备注
    private String apparatusPurchaseRemark;

    //仪器预约状态，0草稿箱、1已提交、2已通过、3已驳回
    private Integer apparatusPurchaseStatus;

    //仪器预约单类型，0预约
    private Integer apparatusPurchaseType;

    public Integer getId() {
        return id;
    }

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

    public String getApparatusPurchaseAuditPerson() {
        return apparatusPurchaseAuditPerson;
    }

    public void setApparatusPurchaseAuditPerson(String apparatusPurchaseAuditPerson) {
        this.apparatusPurchaseAuditPerson = apparatusPurchaseAuditPerson;
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

    public Integer getApparatusPurchasePersonId() {
        return apparatusPurchasePersonId;
    }

    public void setApparatusPurchasePersonId(Integer apparatusPurchasePersonId) {
        this.apparatusPurchasePersonId = apparatusPurchasePersonId;
    }

    public String getApparatusPurchaseAuditPersonId() {
        return apparatusPurchaseAuditPersonId;
    }

    public void setApparatusPurchaseAuditPersonId(String apparatusPurchaseAuditPersonId) {
        this.apparatusPurchaseAuditPersonId = apparatusPurchaseAuditPersonId;
    }

    @Override
    public String toString() {
        return "ApparatusPurchase{" +
                "id=" + id +
                ", apparatusPurchaseApparatusId=" + apparatusPurchaseApparatusId +
                ", apparatusPurchasePerson='" + apparatusPurchasePerson + '\'' +
                ", apparatusPurchaseAuditPerson='" + apparatusPurchaseAuditPerson + '\'' +
                ", apparatusPurchaseReason='" + apparatusPurchaseReason + '\'' +
                ", apparatusPurchaseCtime='" + apparatusPurchaseCtime + '\'' +
                ", apparatusPurchaseLtime='" + apparatusPurchaseLtime + '\'' +
                ", apparatusPurchaseRemark='" + apparatusPurchaseRemark + '\'' +
                ", apparatusPurchaseStatus=" + apparatusPurchaseStatus +
                ", apparatusPurchaseType=" + apparatusPurchaseType +
                '}';
    }
}
