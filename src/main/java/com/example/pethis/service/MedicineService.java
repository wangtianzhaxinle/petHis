package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Medicine;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 梁炜轩
* @description 针对表【medicine】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface MedicineService extends IService<Medicine> {

    Page<Medicine> getMedicineList(Integer pageNum, Integer pageSize);

    Medicine getMedicineInfoById(Integer userId);

    int addMedicineInfo(Medicine medicine);

    int deleteMedicineById(Integer medicineId);

    int updateMedicineById(Medicine medicine);
}
