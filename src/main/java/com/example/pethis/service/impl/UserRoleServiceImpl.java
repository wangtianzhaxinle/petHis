package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.UserRole;
import com.example.pethis.service.UserRoleService;
import com.example.pethis.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 梁炜轩
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2023-03-10 15:01:33
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




