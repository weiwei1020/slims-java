package com.example.demo.lims.controller;

import com.example.demo.lims.service.PersonService;
import com.example.demo.lims.service.ProjectService;
import com.example.demo.lims.vo.PageReturn;
import com.example.demo.lims.vo.Pagelims;
import com.example.demo.lims.vo.Person;
import com.example.demo.lims.vo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
@WeiJie
项目管理
 */
@RestController()
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public PageReturn addProject(Project project){
        return projectService.addProject(project);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public PageReturn deleteProject(Project project){
        return projectService.deleteProject(project);
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public PageReturn updateProject(Project project){
        return projectService.updateProject(project);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public PageReturn selectProject(Project project){
        return projectService.selectProject(project);
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public PageReturn selectAllProject(){
        return projectService.selectAllProject();
    }


    @RequestMapping("/page")
    @ResponseBody
    public Pagelims pageProject(Project project, Integer page, Integer rows ){
        if (page == null){
            page=1;
        }
        if (rows==null){
            rows=20;
        }
        return projectService.pageProject(page,rows,project);
    }



}
