package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Permission;
import com.example.pethis.mapper.PermissionMapper;
import com.example.pethis.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【permission】的数据库操作Service实现
* @createDate 2023-03-03 01:59:43
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{
@Resource
PermissionMapper permissionMapper;
    @Override
    public List<Permission> getPermissionByRoleId(int roleId) {
        return null;
    }

    @Override
    public int addPermissiob(Permission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int deletePermissionById(int permissionId) {
        return permissionMapper.deleteById(permissionId);
    }

    @Override
    public int updatePermssionById(Permission permission) {
        return permissionMapper.updateById(permission);
    }

    @Override
    public Page<Permission> getPermissionList(int pageNum, int pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Permission>page=new Page<>(pageNum,pageSize);
        return permissionMapper.selectPage(page,wrapper);
    }
}




