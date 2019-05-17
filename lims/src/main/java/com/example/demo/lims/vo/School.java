package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
学校
 */
@Component
public class School {
    //学校id
    private Integer schoolId;

    //学校名称
    private String schoolName;

    //学校地址
    private String schoolAddress;

    //学校备注
    private String schoolRemarks;


    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolRemarks() {
        return schoolRemarks;
    }

    public void setSchoolRemarks(String schoolRemarks) {
        this.schoolRemarks = schoolRemarks;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolRemarks='" + schoolRemarks + '\'' +
                '}';
    }
}
