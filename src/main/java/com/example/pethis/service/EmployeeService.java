package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Employee;
import com.example.pethis.entity.EmplpoyeeDutyVO;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【employee】的数据库操作Service
* @createDate 2023-03-03 01:59:42
*/
public interface EmployeeService extends IService<Employee> {

    List<EmplpoyeeDutyVO> getEmployeeList(Integer pageNum, Integer pageSize);

    Employee getEmployeeInfoById(Integer user_id);

List<Object> getEmployeeListByRoleId(int pageNum,int pageSize,int roleId);

    int addEmployee(Employee employee);

    int deleteEmployeeById(Integer id);

    int updateEmployeeById(Employee employee);

List<Object>getEmployeeByDutyAndRole(String weekday,int roleId, int pageNum, int pageSize);
}
