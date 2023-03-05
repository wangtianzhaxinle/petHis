package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【role】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface RoleService extends IService<Role> {

    public List<Role>getRoleListByEmployeeId(int employeeId);

    public int addRole(Role role);

    public int deleteRoleById(int roleId);

    public int  updateRoleById(Role role );

    public Page<Role> getRoleList(int pageNum, int pageSize);

}
