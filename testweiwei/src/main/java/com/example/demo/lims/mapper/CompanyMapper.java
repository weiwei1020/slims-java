package com.example.demo.lims.mapper;

import com.example.demo.lims.vo.Company;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface CompanyMapper {
   Boolean insertCompany(Company company);

   Boolean deleteCompany(Company company);

   Boolean updateCompany(Company company);

   Company selectCompany(Company company);

   List<Company> selectAllCompany();

   int selectCount();

   List<Company> pageCompany(HashMap<String,Object> map);


}
