package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Appoint;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 梁炜轩
* @description 针对表【appoint】的数据库操作Service
* @createDate 2023-03-03 01:59:42
*/
public interface AppointService extends IService<Appoint> {

    Page<Appoint> getAppointList(Integer pageNum, Integer pageSize);

    Appoint getAppointInfoById(Integer appointId);

    int addAppoint(Appoint appoint);
}
