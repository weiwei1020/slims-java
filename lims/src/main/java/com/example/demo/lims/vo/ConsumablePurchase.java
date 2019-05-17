package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
耗材单
 */
@Component
public class ConsumablePurchase extends Consumable{
    //耗材单id
    private Integer purchaseId;
    //耗材单编号
    private String purchaseNumber;
    //耗材单申请人
    private String purchasePerson;
    //耗材单-耗材id
    private Integer purchaseConsumableId;
    //耗材单-耗材单数量
    private Integer consunmableStock;
    //耗材单-价格
    private Integer price;
    //耗材单-订单状态，0已提交，1已通过，2以驳回，3以出库
    private String status;
    //耗材单-订单备注
    private String purchaseRemark;
    //耗材单-创建时间
    private String ctime;
    //耗材单-最后修改时间
    private String ltime;
    //耗材单-理由
    private String reason;
    //耗材单-订单类型，0采购，1领用，2归还
    private Integer purchaseType;
    //采购总价格
    private Integer sumPrice;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public Integer getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "ConsumablePurchase{" +
                "purchaseId=" + purchaseId +
                ", purchaseNumber='" + purchaseNumber + '\'' +
                ", purchasePerson='" + purchasePerson + '\'' +
                ", purchaseConsumableId=" + purchaseConsumableId +
                ", consunmableStock=" + consunmableStock +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", purchaseRemark='" + purchaseRemark + '\'' +
                ", ctime='" + ctime + '\'' +
                ", ltime='" + ltime + '\'' +
                ", reason='" + reason + '\'' +
                ", purchaseType=" + purchaseType +
                ", sumPrice=" + sumPrice +
                '}';
    }
}
