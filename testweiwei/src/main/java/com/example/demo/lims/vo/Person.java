package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private Integer personId;

    private String personName;

    private Integer personAge;

    private String personGender;

    private Integer personSchoolId;

    private String personSchoolName;

    private Integer personRole;

    private String personRoleName;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public Integer getPersonSchoolId() {
        return personSchoolId;
    }

    public void setPersonSchoolId(Integer personSchoolId) {
        this.personSchoolId = personSchoolId;
    }

    public String getPersonSchoolName() {
        return personSchoolName;
    }

    public void setPersonSchoolName(String personSchoolName) {
        this.personSchoolName = personSchoolName;
    }

    public Integer getPersonRole() {
        return personRole;
    }

    public void setPersonRole(Integer personRole) {
        this.personRole = personRole;
    }

    public String getPersonRoleName() {
        return personRoleName;
    }

    public void setPersonRoleName(String personRoleName) {
        this.personRoleName = personRoleName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personGender='" + personGender + '\'' +
                ", personSchoolId=" + personSchoolId +
                ", personSchoolName='" + personSchoolName + '\'' +
                ", personRole=" + personRole +
                ", personRoleName='" + personRoleName + '\'' +
                '}';
    }
}
