package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Project;
import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
@Weijie
实验计划
 */
@Repository
public interface ProjectMapper {
   //添加实验计划
   Boolean insertProject(Project project);

   //删除实验计划
   Boolean deleteProject(Project project);

   //修改实验计划
   Boolean updateProject(Project project);

   //查询某条实验计划
   Project selectProject(Project project);

   //查询实验计划列表
   List<Project> selectAllProject();

   //查询实验计划列表条数
   int selectCount();

   //以分页形式查询实验计划列表
   List<Project> pageProject(HashMap<String, Object> map);


}
