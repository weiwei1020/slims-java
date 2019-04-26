package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Project;
import com.example.demo.lims.vo.School;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ProjectMapper {
   Boolean insertProject(Project project);

   Boolean deleteProject(Project project);

   Boolean updateProject(Project project);

   Project selectProject(Project project);

   List<Project> selectAllProject();

   int selectCount();

   List<Project> pageProject(HashMap<String, Object> map);


}
