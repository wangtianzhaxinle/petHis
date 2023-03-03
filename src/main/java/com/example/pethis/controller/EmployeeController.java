package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Employee;
import com.example.pethis.entity.EmployeeVO;
import com.example.pethis.service.EmployeeService;
import com.example.pethis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //获取所有员工信息,分页
    @GetMapping("/getEmployeeList")
    public Result getEmployeeList(Integer pageNum, Integer pageSize) {
        System.out.println("getEmployeeList");
        Page<Employee> employeePage = employeeService.getEmployeeList(pageNum, pageSize);

        return Result.ok("查找员工信息成功", employeePage.getRecords(), employeePage.getTotal());
    }

    @GetMapping("/getEmployeeInfoById")
    public Result getEmployeeInfoById(Integer userId) {
        System.out.println("getEmployeeInfoById");
        Employee employee = employeeService.getEmployeeInfoById(userId);
        if (employee == null) {
            return Result.error("查找该员工信息失败");
        }

        return Result.ok("查找该员工信息成功", employee, 1);
    }

    public Result addEmployee(Employee employee) {
        System.out.println("addEmployee");
        int rows = employeeService.addEmployee(employee);
        if (rows > 0) {
            return Result.ok("添加员工信息成功", null, 1);
        }
        else {
            return Result.error("添加员工失败");
        }


    }
    @GetMapping("/getEmployeeListByRoleId")
    public  Result getEmployeeListByRoleId(int pageNum,int pageSize,int roleId){
        System.out.println("getEmployeeListByRoleId");
        List<Object> objectList=employeeService.getEmployeeListByRoleId(pageNum,pageSize,roleId);
        List<EmployeeVO> list =(List<EmployeeVO>) objectList.get(0);
        int total =(Integer)((List<Object>)objectList.get(1)).get(0);

        return Result.ok("获取项目员工信息成功",list, total);
    }

    @DeleteMapping("deleteEmployee")
    public Result deleteEmployee(Integer id) {
        System.out.println("deleteEmployee");
        int rows = employeeService.deleteEmployeeById(id);
        if (rows > 0) {
            return Result.ok("删除员工信息成功", null, 1);
        }
        else {
            return Result.error("删除员工失败");
        }


    }

    public Result deleteEmployeesbByIds(int[] ids) {
        System.out.println("deleteEmployeesbByIds");
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
        System.out.println("updateEmployeesById");
        int rows = employeeService.updateEmployeeById(employee);
        if (rows > 0) {
            return Result.ok("修改员工信息成功", null, 1);
        }
        else {
            return Result.error("修改员工信息失败");
        }

    }
}
