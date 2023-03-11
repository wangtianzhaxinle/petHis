package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Role;
import com.example.pethis.entity.RolePermission;
import com.example.pethis.service.RolePermissionService;
import com.example.pethis.service.RoleService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @projectName: petHis
 * @package: com.example.pethis.controller
 * @className: RoleController
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/6 13:47
 * @version: 1.0
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    RoleService roleService;
    @Resource
    RolePermissionService rolePermissionService;

    @GetMapping("/getRoleList")
    public Result getRoleList(int pageNum,int pageSize) {
        System.out.println("getRoleList");
        Page<Role> roleList = roleService.getRoleList(pageNum,pageSize);
        return Result.ok("获取角色列表成功", roleList.getRecords(), roleList.getTotal());
    }
    @GetMapping("/getPermissionByRoleId")
    public Result getPermissionByRoleId(int roleId) {
        System.out.println("getPermissionByRoleId");
        List<RolePermission> list = rolePermissionService.getRolePermissionListByRoleId(roleId);
        return Result.ok("获取权限树成功", list, list.size());
    }
}
