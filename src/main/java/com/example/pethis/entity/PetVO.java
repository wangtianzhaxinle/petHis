package com.example.pethis.entity;

import lombok.Data;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: petVO
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/3 11:31
 * @version: 1.0
 */
@Data
public class PetVO extends  Pet{
    private User user;
}
