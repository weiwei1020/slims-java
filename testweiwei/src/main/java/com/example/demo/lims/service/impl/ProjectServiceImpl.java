package com.example.demo.lims.service.impl;

import com.example.demo.lims.mapper.ProjectMapper;
import com.example.demo.lims.mapper.SchoolMapper;
import com.example.demo.lims.service.ProjectService;
import com.example.demo.lims.service.SchoolService;
import com.example.demo.lims.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;


    @Override
    public PageReturn addProject(Project project) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        project.setProjectCtime(slimsTools.gainSystemTime());
        if (projectMapper.insertProject(project) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;

    }

    @Override
    public PageReturn deleteProject(Project project) {
        PageReturn pageReturn=new PageReturn();

        if (projectMapper.deleteProject(project) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }

    @Override
    public PageReturn updateProject(Project project) {
        PageReturn pageReturn=new PageReturn();
        SlimsTools slimsTools = new SlimsTools();
        project.setProjectCtime(slimsTools.gainSystemTime());

        if (projectMapper.updateProject(project) == true){
            pageReturn.setData("0");
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setData("1");
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectProject(Project project) {
        PageReturn pageReturn = new PageReturn();

        pageReturn.setData(projectMapper.selectProject(project));
        if (projectMapper.selectProject(project).getProjectName() != null){
            pageReturn.setCode(1);
            pageReturn.setMsg("成功");
            pageReturn.setSuccess(true);
        }else {
            pageReturn.setCode(0);
            pageReturn.setMsg("失败");
            pageReturn.setSuccess(false);
        }
        return pageReturn;
    }


    @Override
    public PageReturn selectAllProject(){
        PageReturn pageReturn=new PageReturn();
        pageReturn.setCode(1);
        pageReturn.setData(projectMapper.selectAllProject());
        pageReturn.setMsg("成功");
        pageReturn.setSuccess(true);
        return pageReturn;
    }


    @Override
    public Pagelims pageProject(int currentPage, int pageSize, Project project) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Project> pageBean = new PageBean<Project>();

        //封装当前页数
        pageBean.setPages(currentPage);

        //每页显示的数据
        pageBean.setSize(pageSize);

        //封装总记录数
        int totalCount = projectMapper.selectCount();
        pageBean.setTotal(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        if (project.getProjectName()==null){
            project.setProjectName("");
        }
        if (project.getProjectPerson()==null){
            project.setProjectPerson("");
        }
        map.put("projectName",project.getProjectName());
        map.put("projectPerson",project.getProjectPerson());
        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getSize());
        //封装每页显示的数据
        List<Project> lists = projectMapper.pageProject(map);
        pageBean.setRecords(lists);
        Pagelims pageCompany = new Pagelims();
        pageCompany.setCode(1);
        pageCompany.setData(pageBean);
        return pageCompany;
    }

}
