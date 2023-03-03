package com.example.pethis.entity;

import lombok.Data;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: EmployeeVO
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/3 22:47
 * @version: 1.0
 */
@Data
public class EmployeeVO extends Employee{
    private User user;
}
