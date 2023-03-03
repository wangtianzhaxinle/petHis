package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Permission;
import com.example.pethis.service.PermissionService;
import com.example.pethis.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author 梁炜轩
* @description 针对表【permission】的数据库操作Service实现
* @createDate 2023-03-03 01:59:43
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




