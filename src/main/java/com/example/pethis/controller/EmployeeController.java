package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Employee;
import com.example.pethis.service.EmployeeService;
import com.example.pethis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //获取所有员工信息,分页
    @GetMapping("/getEmployeeList")
    public Result getEmployeeList(Integer pageNum, Integer pageSize) {

        Page<Employee> employeePage = employeeService.getEmployeeList(pageNum, pageSize);

        return Result.ok("查找员工信息成功", employeePage.getRecords(), employeePage.getSize());
    }

    @GetMapping("/getEmployeeInfoById")
    public Result getEmployeeInfoById(Integer id) {
        Employee employee = employeeService.getEmployeeInfoById(id);


        return Result.ok("查找该员工信息成功", employee, 1);
    }

    public Result addEmployee(Employee employee) {
        int rows = employeeService.addEmployee(employee);
        if (rows > 0) {
            return Result.ok("添加员工信息成功", null, 1);
        }
        else {
            return Result.error("添加员工失败");
        }


    }

    @DeleteMapping("deleteEmployee")
    public Result deleteEmployee(Integer id) {
        int rows = employeeService.deleteEmployeeById(id);
        if (rows > 0) {
            return Result.ok("删除员工信息成功", null, 1);
        }
        else {
            return Result.error("删除员工失败");
        }


    }

    public Result deleteEmployeesbByIds(int[] ids) {
        for (int i = 0; i < ids.length; i++) {
            int rows = employeeService.deleteEmployeeById(ids[i]);
            if (rows <= 0) {
                return Result.error("删除员工失败");

            }
        }

        return Result.ok("删除员工信息成功", null, 1);

    }

    @PutMapping("/updateEmployeesById")
    public Result updateEmployeesById(Employee employee) {
        int rows = employeeService.updateEmployeeById(employee);
        if (rows > 0) {
            return Result.ok("修改员工信息成功", null, 1);
        }
        else {
            return Result.error("修改员工信息失败");
        }

    }
}