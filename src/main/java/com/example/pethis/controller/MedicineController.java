package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Medicine;
import com.example.pethis.service.MedicineService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @Resource
    MedicineService medicineService;

    @GetMapping("/getMedicineList")
    public Result getMedicineList(Integer pageNum, Integer pageSize) {
        System.out.println("getMedicineList");
        Page<Medicine> medicinePage = medicineService.getMedicineList(pageNum, pageSize);

        return Result.ok("查找药物信息成功", medicinePage.getRecords(), medicinePage.getTotal());
    }

    @GetMapping("/getMedicineInfoById")
    public Result getMedicineInfoById(Integer medicineId) {
        System.out.println("getMedicineInfoById");
        Medicine medicine = medicineService.getMedicineInfoById(medicineId);
        if (medicine == null) {
            return Result.error("查找该药物信息失败");
        }

        return Result.ok("查找该药物信息成功", medicine, 1);
    }

    @PostMapping("/addMedicineInfo")
    public Result addMedicineInfo(@RequestBody Medicine medicine) {
        System.out.println("addMedicineInfo");
        System.out.println(medicine);
      int rows=  medicineService.addMedicineInfo(medicine);
      if(rows>0){
          return Result.ok("添加药品信息成功",null,1);
      }
        return Result.error("添加药品信息失败");
    }

    @DeleteMapping("/deleteMedicineById/{medicineId}")
    public Result deleteMedicineById(@PathVariable  int medicineId) {
        System.out.println("deleteMedicineById");
        System.out.println(medicineId);
        int rows=medicineService.deleteMedicineById(medicineId);
        if(rows>0){
            return Result.ok("删除药品成功",null,1);
        }
        return Result.error("删除药品失败");

    }
    @PostMapping("/updateMedicineInfo")
    public Result updateMedicineInfo(@RequestBody Medicine medicine) {
        System.out.println("updateMedicineInfo");
        System.out.println(medicine);
        int rows=medicineService.updateMedicineById(medicine);
        if(rows>0){
            return Result.ok("修改药品信息成功",null,1);
        }
        return Result.error("修改药品信息失败");
    }
}
