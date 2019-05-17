package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
人员
 */
@Component
public class Person {
    //人员id
    private Integer personId;

    //人员姓名
    private String personName;

    //人员年龄
    private Integer personAge;

    //人员性别
    private String personGender;

    //人员学校id
    private Integer personSchoolId;

    //人员学校名称
    private String personSchoolName;

    //人员权限标号，0管理员、1老师、2学生
    private Integer personRole;

    //人员权限名称，管理员、老师、学生
    private String personRoleName;

    //人员登录密码
    private String personPassword;

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

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
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
                ", personPassword='" + personPassword + '\'' +
                '}';
    }
}
