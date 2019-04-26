package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class Project {

    private Integer projectId;
    private String projectName;
    private String projectCtime;
    private String projectRemark;
    private Integer projectPersonId;
    private String projectPerson;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCtime() {
        return projectCtime;
    }

    public void setProjectCtime(String projectCtime) {
        this.projectCtime = projectCtime;
    }

    public String getProjectRemark() {
        return projectRemark;
    }

    public void setProjectRemark(String projectRemark) {
        this.projectRemark = projectRemark;
    }

    public Integer getProjectPersonId() {
        return projectPersonId;
    }

    public void setProjectPersonId(Integer projectPersonId) {
        this.projectPersonId = projectPersonId;
    }

    public String getProjectPerson() {
        return projectPerson;
    }

    public void setProjectPerson(String projectPerson) {
        this.projectPerson = projectPerson;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectCtime='" + projectCtime + '\'' +
                ", projectRemark='" + projectRemark + '\'' +
                ", projectPersonId=" + projectPersonId +
                ", projectPerson='" + projectPerson + '\'' +
                '}';
    }
}
