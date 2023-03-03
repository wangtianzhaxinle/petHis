package com.example.pethis.mapper;

import com.example.pethis.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【employee】的数据库操作Mapper
* @createDate 2023-03-03 01:59:42
* @Entity com.example.pethis.entity.Employee
*/
public interface EmployeeMapper extends BaseMapper<Employee> {
    List<Object> getEmployeeListByRoleId(int currentPage, int pageSize, int roleId);
}




