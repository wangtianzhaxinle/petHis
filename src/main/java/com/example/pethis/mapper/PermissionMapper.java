package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Permission;
import com.example.pethis.entity.PermissionTree;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【permission】的数据库操作Mapper
* @createDate 2023-03-03 01:59:43
* @Entity com.example.pethis.entity.Permission
*/
public interface PermissionMapper extends BaseMapper<Permission> {

    List<PermissionTree> getPermissionTree();
}




