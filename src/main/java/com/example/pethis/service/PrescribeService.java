package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Prescribe;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 梁炜轩
* @description 针对表【prescribe】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface PrescribeService extends IService<Prescribe> {

    int addPrescribe(Prescribe prescribe);

    int deletePrescribeById(int id);

    Page<Prescribe> getPrescribeList(int pageNum, int pageSize);
}
