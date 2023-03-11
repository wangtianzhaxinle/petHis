package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Permission;
import com.example.pethis.entity.PermissionTree;
import com.example.pethis.service.PermissionService;
import com.example.pethis.service.RolePermissionService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @projectName: petHis
 * @package: com.example.pethis.controller
 * @className: PermissionController
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/11 12:42
 * @version: 1.0
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Resource
    PermissionService permissionService;
    @Resource
    RolePermissionService rolePermissionService;

    @GetMapping("/getPermissionList")
    public Result getPermissionList(int pageNum, int pageSize) {
        Page<Permission> perList = permissionService.getPermissionList(pageNum, pageSize);
        return Result.ok("获取权限列表成功", perList.getRecords(), perList.getTotal());
    }

    @DeleteMapping("/deletePermissionById")
    public Result deletePermissionById(int id) {
        int rows = permissionService.deletePermissionById(id);
        if (rows > 0) {
            return Result.ok("删除权限成功", null, 1);
        }

        return Result.error("删除权限失败");
    }

    @PostMapping("/deletePermissionByIds")
    public Result deletePermissionByIds(@RequestBody int[] ids) {
        System.out.println("deletePermissionByIds");
        // System.out.println("ids="+ Arrays.toString(ids));
        for (int i = 0; i < ids.length; i++) {
            int rows = permissionService.deletePermissionById(ids[i]);
            if (rows <= 0) {
                return Result.error("批量删除权限失败");
            }
        }
        return Result.ok("批量删除权限成功", "delete success", 1);
    }

    @GetMapping("/getPermissionTree")
    public Result getPermissionTree() {
        System.out.println("getPermissionTree");
        List<PermissionTree> tree = permissionService.getPermissionTree();
        return Result.ok("获取权限树成功", tree, tree.size());
    }


}
