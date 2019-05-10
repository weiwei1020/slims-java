package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class ConsumablePurchase extends Consumable{
    //耗材采购id
    private Integer purchaseId;
    //耗材采购编号
    private String purchaseNumber;
    //耗材采购申请人
    private String purchasePerson;
    //耗材采购-耗材id
    private Integer purchaseConsumableId;
    //耗材采购-耗材名称
    private String consumableName;
    //耗材采购-耗材采购数量
    private Integer consunmableStock;
    //耗材采购-价格
    private Integer price;
    //耗材采购-订单状态，0已提交，1已通过，2以驳回，3以出库
    private Integer status;
    //耗材采购-订单备注
    private String purchaseRemark;
    //耗材采购-创建时间
    private String ctime;
    //耗材采购-最后修改时间
    private String ltime;
    //耗材采购-采购理由
    private String reason;
    //耗材采购-订单类型，0采购，1领用，2归还
    private Integer purchaseType;

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getPurchasePerson() {
        return purchasePerson;
    }

    public void setPurchasePerson(String purchasePerson) {
        this.purchasePerson = purchasePerson;
    }

    public Integer getPurchaseConsumableId() {
        return purchaseConsumableId;
    }

    public void setPurchaseConsumableId(Integer purchaseConsumableId) {
        this.purchaseConsumableId = purchaseConsumableId;
    }

    public String getConsumableName() {
        return consumableName;
    }

    public void setConsumableName(String consumableName) {
        this.consumableName = consumableName;
    }

    public Integer getConsunmableStock() {
        return consunmableStock;
    }

    public void setConsunmableStock(Integer consunmableStock) {
        this.consunmableStock = consunmableStock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseRemark() {
        return purchaseRemark;
    }

    public void setPurchaseRemark(String purchaseRemark) {
        this.purchaseRemark = purchaseRemark;
    }

    @Override
    public String toString() {
        return "ConsumablePurchase{" +
                "purchaseId=" + purchaseId +
                ", purchaseNumber='" + purchaseNumber + '\'' +
                ", purchasePerson='" + purchasePerson + '\'' +
                ", purchaseConsumableId=" + purchaseConsumableId +
                ", consumableName='" + consumableName + '\'' +
                ", consunmableStock=" + consunmableStock +
                ", price=" + price +
                ", status=" + status +
                ", purchaseRemark='" + purchaseRemark + '\'' +
                ", ctime='" + ctime + '\'' +
                ", ltime='" + ltime + '\'' +
                ", reason='" + reason + '\'' +
                ", purchaseType=" + purchaseType +
                '}';
    }
}
