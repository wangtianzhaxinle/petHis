package com.example.pethis.entity;

import lombok.Data;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: EmplpoyeeDutyVO
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/6 19:10
 * @version: 1.0
 */
@Data
public class EmplpoyeeDutyVO extends Employee{
    private User user;
    private Duty duty;
private UserRole userRole
        ;


}
