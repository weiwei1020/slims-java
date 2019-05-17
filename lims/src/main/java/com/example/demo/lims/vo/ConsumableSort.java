package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
耗材类别
 */
@Component
public class ConsumableSort {

    //耗材类别id
    private Integer consumableSortId;

    //耗材类别名称
    private String consumableSortName;

    //耗材类别编号
    private String consumableSortNumber;

    //耗材类别备注
    private String consumableSortRemark;

    public Integer getConsumableSortId() {
        return consumableSortId;
    }

    public void setConsumableSortId(Integer consumableSortId) {
        this.consumableSortId = consumableSortId;
    }

    public String getConsumableSortName() {
        return consumableSortName;
    }

    public void setConsumableSortName(String consumableSortName) {
        this.consumableSortName = consumableSortName;
    }

    public String getConsumableSortNumber() {
        return consumableSortNumber;
    }

    public void setConsumableSortNumber(String consumableSortNumber) {
        this.consumableSortNumber = consumableSortNumber;
    }

    public String getConsumableSortRemark() {
        return consumableSortRemark;
    }

    public void setConsumableSortRemark(String consumableSortRemark) {
        this.consumableSortRemark = consumableSortRemark;
    }

    @Override
    public String toString() {
        return "ConsumableSort{" +
                "consumableSortId=" + consumableSortId +
                ", consumableSortName='" + consumableSortName + '\'' +
                ", consumableSortNumber='" + consumableSortNumber + '\'' +
                ", consumableSortRemark='" + consumableSortRemark + '\'' +
                '}';
    }
}
