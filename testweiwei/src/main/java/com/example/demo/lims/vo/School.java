package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class School {
    private Integer schoolId;
    private String schoolName;
    private String schoolAddress;
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
