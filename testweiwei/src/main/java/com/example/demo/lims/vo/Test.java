package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class Test {
     private Integer testId;
     private String testName;
     private String testUname;
     private String testRemark;
     private String testBrginDate;
     private String testEndDate;
     private Integer  testState;
     private Integer testProjectId;
     private String testProjectName;

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

     public String getTestBrginDate() {
          return testBrginDate;
     }

     public void setTestBrginDate(String testBrginDate) {
          this.testBrginDate = testBrginDate;
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

     @Override
     public String toString() {
          return "Test{" +
                  "testId=" + testId +
                  ", testName='" + testName + '\'' +
                  ", testUname='" + testUname + '\'' +
                  ", testRemark='" + testRemark + '\'' +
                  ", testBrginDate='" + testBrginDate + '\'' +
                  ", testEndDate='" + testEndDate + '\'' +
                  ", testState=" + testState +
                  ", testProjectId=" + testProjectId +
                  ", testProjectName='" + testProjectName + '\'' +
                  '}';
     }
}
