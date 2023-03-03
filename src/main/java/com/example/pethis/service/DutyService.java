package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Duty;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【duty】的数据库操作Service
* @createDate 2023-03-03 01:59:42
*/
public interface DutyService extends IService<Duty> {

    List<Object>getDutyPage(int pageNum, int pageSize);
}
