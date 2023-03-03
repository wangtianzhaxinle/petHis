package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Duty;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【duty】的数据库操作Mapper
* @createDate 2023-03-03 01:59:42
* @Entity com.example.pethis.entity.Duty
*/
public interface DutyMapper extends BaseMapper<Duty> {
public List<Object>selectAllDuty(int currentPage,int pageSize);
}




