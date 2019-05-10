package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class ConsumableSort {

    private Integer consumableSortId;
    private String consumableSortName;
    private String consumableSortNumber;
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
