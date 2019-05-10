package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.ApparatusSort;
import com.example.demo.lims.vo.Test;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ApparatusSortMapper {
   Boolean insertApparatusSort(ApparatusSort apparatusSort);

   Boolean deleteApparatusSort(ApparatusSort apparatusSort);

   Boolean updateApparatusSort(ApparatusSort apparatusSort);

   ApparatusSort selectApparatusSort(ApparatusSort apparatusSort);

   List<ApparatusSort> selectAllApparatusSort();

   int selectCount();

   List<ApparatusSort> pageApparatusSort(HashMap<String, Object> map);

}
