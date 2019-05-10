package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;


//耗材
@Component
public class Apparatus {

    //仪器id
    private Integer apparatusId;
    //仪器编码
    private String apparatusNum;
    //仪器类别id
    private String apparatusSortId;
    //仪器类别名称
    private String apparatusSortName;
    //仪器品牌
    private Integer apparatusBrand;
    //仪器价格
    private String apparatusPrice;
    //仪器购买日期
    private String apparatusBuyTime;
    //仪器备注
    private String apparatusRemark;

    public Integer getApparatusId() {
        return apparatusId;
    }

    public void setApparatusId(Integer apparatusId) {
        this.apparatusId = apparatusId;
    }

    public String getApparatusNum() {
        return apparatusNum;
    }

    public void setApparatusNum(String apparatusNum) {
        this.apparatusNum = apparatusNum;
    }

    public String getApparatusSortId() {
        return apparatusSortId;
    }

    public void setApparatusSortId(String apparatusSortId) {
        this.apparatusSortId = apparatusSortId;
    }

    public String getApparatusSortName() {
        return apparatusSortName;
    }

    public void setApparatusSortName(String apparatusSortName) {
        this.apparatusSortName = apparatusSortName;
    }

    public Integer getApparatusBrand() {
        return apparatusBrand;
    }

    public void setApparatusBrand(Integer apparatusBrand) {
        this.apparatusBrand = apparatusBrand;
    }

    public String getApparatusPrice() {
        return apparatusPrice;
    }

    public void setApparatusPrice(String apparatusPrice) {
        this.apparatusPrice = apparatusPrice;
    }

    public String getApparatusBuyTime() {
        return apparatusBuyTime;
    }

    public void setApparatusBuyTime(String apparatusBuyTime) {
        this.apparatusBuyTime = apparatusBuyTime;
    }

    public String getApparatusRemark() {
        return apparatusRemark;
    }

    public void setApparatusRemark(String apparatusRemark) {
        this.apparatusRemark = apparatusRemark;
    }

    @Override
    public String toString() {
        return "Apparatus{" +
                "apparatusId=" + apparatusId +
                ", apparatusNum='" + apparatusNum + '\'' +
                ", apparatusSortId='" + apparatusSortId + '\'' +
                ", apparatusSortName='" + apparatusSortName + '\'' +
                ", apparatusBrand=" + apparatusBrand +
                ", apparatusPrice='" + apparatusPrice + '\'' +
                ", apparatusBuyTime='" + apparatusBuyTime + '\'' +
                ", apparatusRemark='" + apparatusRemark + '\'' +
                '}';
    }
}
