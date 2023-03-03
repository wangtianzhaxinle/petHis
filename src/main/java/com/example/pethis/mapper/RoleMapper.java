package com.example.pethis.mapper;

import com.example.pethis.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【role】的数据库操作Mapper
* @createDate 2023-03-03 01:59:43
* @Entity com.example.pethis.entity.Role
*/
public interface RoleMapper extends BaseMapper<Role> {
    List<Object> getRoleInfoList(int currentPage, int pageSize);

}




