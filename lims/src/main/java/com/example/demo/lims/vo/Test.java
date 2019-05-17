package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
实验
 */
@Component
public class Test {
     //实验id
     private Integer testId;

     //实验名称
     private String testName;

     //实验发布人
     private String testUname;

     //实验备注
     private String testRemark;

     //实验预计开始时间
     private String testBeginDate;

     //实验预计结束时间
     private String testEndDate;

     //实验状态，0以发布、1开始、2暂停、3中止、4结束
     private Integer  testState;

     //实验计划id
     private Integer testProjectId;

     //实验计划名称
     private String testProjectName;

     //实验实际开始时间
     private String beginDate;

     //实验实际结束时间
     private String endDate;

     public Integer getTestId() {
          return testId;
     }

     public void setTestId(Integer testId) {
          this.testId = testId;
     }

     public String getTestName() {
          return testName;
     }

     public void setTestName(String testName) {
          this.testName = testName;
     }

     public String getTestUname() {
          return testUname;
     }

     public void setTestUname(String testUname) {
          this.testUname = testUname;
     }

     public String getTestRemark() {
          return testRemark;
     }

     public void setTestRemark(String testRemark) {
          this.testRemark = testRemark;
     }

     public String getTestBeginDate() {
          return testBeginDate;
     }

     public void setTestBeginDate(String testBeginDate) {
          this.testBeginDate = testBeginDate;
     }

     public String getTestEndDate() {
          return testEndDate;
     }

     public void setTestEndDate(String testEndDate) {
          this.testEndDate = testEndDate;
     }

     public Integer getTestState() {
          return testState;
     }

     public void setTestState(Integer testState) {
          this.testState = testState;
     }

     public Integer getTestProjectId() {
          return testProjectId;
     }

     public void setTestProjectId(Integer testProjectId) {
          this.testProjectId = testProjectId;
     }

     public String getTestProjectName() {
          return testProjectName;
     }

     public void setTestProjectName(String testProjectName) {
          this.testProjectName = testProjectName;
     }

     public String getBeginDate() {
          return beginDate;
     }

     public void setBeginDate(String beginDate) {
          this.beginDate = beginDate;
     }

     public String getEndDate() {
          return endDate;
     }

     public void setEndDate(String endDate) {
          this.endDate = endDate;
     }

     @Override
     public String toString() {
          return "Test{" +
                  "testId=" + testId +
                  ", testName='" + testName + '\'' +
                  ", testUname='" + testUname + '\'' +
                  ", testRemark='" + testRemark + '\'' +
                  ", testBeginDate='" + testBeginDate + '\'' +
                  ", testEndDate='" + testEndDate + '\'' +
                  ", testState=" + testState +
                  ", testProjectId=" + testProjectId +
                  ", testProjectName='" + testProjectName + '\'' +
                  ", beginDate='" + beginDate + '\'' +
                  ", endDate='" + endDate + '\'' +
                  '}';
     }
}
