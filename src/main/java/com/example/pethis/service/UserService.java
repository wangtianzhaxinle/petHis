package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 梁炜轩
* @description 针对表【user】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface UserService extends IService<User> {

    int delectUserById(int id);

    int updateUserById(User user);

    User selectUserByUsername(String username);

    Page<User> selectAllUserInfo(Integer pageNum, Integer pageSize);
}
