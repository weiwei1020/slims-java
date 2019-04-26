package com.example.demo.lims.service;

import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Project;
import com.example.demo.lims.vo.School;

public interface ProjectService {
    PageReturn addProject(Project project);

    PageReturn deleteProject(Project project);

    PageReturn updateProject(Project project);

    PageReturn selectProject(Project project);

    PageReturn selectAllProject();

    Pagelims pageProject(int currentPage, int pageSize, Project project);

}
