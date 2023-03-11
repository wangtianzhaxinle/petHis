package com.example.pethis.entity;

import lombok.Data;

import java.util.List;

/**
 * @projectName: petHis
 * @package: com.example.pethis.entity
 * @className: PremissionTree
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/11 22:47
 * @version: 1.0
 */
@Data
public class PermissionTree extends Permission{
    private List<Permission>childrenPermission;
}
