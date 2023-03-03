package com.example.pethis.service;

import com.example.pethis.entity.Pet;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【pet】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface PetService extends IService<Pet> {
    

    List<Object> getPetInfoList(int pageNum, int pageSize);

    Pet getPetById(int petId);

    List<Object> getPetListByUserId(int pageNum, int pageSize,int userId);
}
