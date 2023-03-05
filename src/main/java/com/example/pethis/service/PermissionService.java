package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Permission;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【permission】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface PermissionService extends IService<Permission> {

    public List<Permission> getPermissionByRoleId(int roleId);

    public int addPermissiob(Permission permission);

    public int deletePermissionById(int permissionId);

    public int updatePermssionById(Permission permission);

    public Page<Permission> getPermissionList(int pageNum, int pageSize);

}
