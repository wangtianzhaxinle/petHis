package com.example.pethis.entity;

import lombok.Data;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: DutyVO
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/3 2:47
 * @version: 1.0
 */
@Data
public class DutyVO extends Duty {
    private User user;

}
