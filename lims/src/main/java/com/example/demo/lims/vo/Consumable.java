package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
耗材资产
 */
@Component
public class Consumable {
    //耗材id
    private Integer id;

    //耗材编号
    private String num;

    //耗材名称
    private String name;

    //耗材类别id
    private Integer consumableId;

    //耗材类别名称
    private String consumable;

    //耗材仓库位置
    private String storehouse;

    //耗材库存量
    private Integer stock;

    //耗材计量单位
    private String unit;

    //耗材备注
    private String remark;

    //耗材价格
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getConsumableId() {
        return consumableId;
    }

    public void setConsumableId(Integer consumableId) {
        this.consumableId = consumableId;
    }

    public String getConsumable() {
        return consumable;
    }

    public void setConsumable(String consumable) {
        this.consumable = consumable;
    }

    public String getStorehouse() {
        return storehouse;
    }

    public void setStorehouse(String storehouse) {
        this.storehouse = storehouse;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "Consumable{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", consumableId=" + consumableId +
                ", consumable='" + consumable + '\'' +
                ", storehouse='" + storehouse + '\'' +
                ", stock=" + stock +
                ", unit='" + unit + '\'' +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                '}';
    }
}
