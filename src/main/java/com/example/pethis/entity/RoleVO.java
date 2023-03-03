package com.example.pethis.entity;

import lombok.Data;

import java.util.List;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: RoleVO
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/3 16:50
 * @version: 1.0
 */
@Data
public class RoleVO extends Role{
    private List<EmployeeVO> employeeVOList;
    private List<Permission>permissionList;
}
