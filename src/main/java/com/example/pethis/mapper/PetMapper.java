package com.example.pethis.mapper;

import com.example.pethis.entity.Pet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【pet】的数据库操作Mapper
* @createDate 2023-03-03 01:59:43
* @Entity com.example.pethis.entity.Pet
*/
public interface PetMapper extends BaseMapper<Pet> {

    List<Object> getPetInfoList(int currentPage, int pageSize);
//这里参数名写错了,currentPage写成了icurrentPage,导致了Failed to load ApplicationContext
    List<Object> getPetListByUserId(int currentPage, int pageSize, int userId);
}




