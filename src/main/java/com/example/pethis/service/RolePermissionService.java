package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.RolePermission;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【role_permission】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface RolePermissionService extends IService<RolePermission> {

    public List<RolePermission> getRolePermissionListByRoleId(int roleId);

}
