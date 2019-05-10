package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;


//耗材类别
@Component
public class ApparatusSort {

    //仪器类别id
    private Integer apparatusSortId;
    //仪器类别名称
    private String apparatusSortName;
    //仪器类别编号
    private String apparatusSortNumber;
    //仪器类别备注
    private String apparatusSortRemark;

    public Integer getApparatusSortId() {
        return apparatusSortId;
    }

    public void setApparatusSortId(Integer apparatusSortId) {
        this.apparatusSortId = apparatusSortId;
    }

    public String getApparatusSortName() {
        return apparatusSortName;
    }

    public void setApparatusSortName(String apparatusSortName) {
        this.apparatusSortName = apparatusSortName;
    }

    public String getApparatusSortNumber() {
        return apparatusSortNumber;
    }

    public void setApparatusSortNumber(String apparatusSortNumber) {
        this.apparatusSortNumber = apparatusSortNumber;
    }

    public String getApparatusSortRemark() {
        return apparatusSortRemark;
    }

    public void setApparatusSortRemark(String apparatusSortRemark) {
        this.apparatusSortRemark = apparatusSortRemark;
    }

    @Override
    public String toString() {
        return "ApparatusSort{" +
                "apparatusSortId=" + apparatusSortId +
                ", apparatusSortName='" + apparatusSortName + '\'' +
                ", apparatusSortNumber='" + apparatusSortNumber + '\'' +
                ", apparatusSortRemark='" + apparatusSortRemark + '\'' +
                '}';
    }
}
