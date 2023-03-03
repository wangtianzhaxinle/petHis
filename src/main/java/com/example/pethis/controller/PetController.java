package com.example.pethis.controller;

import com.example.pethis.entity.Pet;
import com.example.pethis.entity.PetVO;
import com.example.pethis.service.PetService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Resource
    PetService petService;
@GetMapping("/getPetList")
    public Result getPetList(int pageNum, int pageSize) {
    System.out.println("getDutyList");

    List<Object> objectList=petService.getPetInfoList(pageNum,pageSize);
    List<PetVO> list =(List<PetVO>) objectList.get(0);
    int total =(Integer)((List<Object>)objectList.get(1)).get(0);

    return Result.ok("获取宠物信息成功",list, total);
    }
    @GetMapping("/getPetListByUserId")
    public Result getPetListByUserId(int pageNum, int pageSize,int userId) {
        System.out.println("getPetListByUserId");

        List<Object> objectList=petService.getPetListByUserId(pageNum,pageSize,userId);
        List<PetVO> list =(List<PetVO>) objectList.get(0);
        int total =(Integer)((List<Object>)objectList.get(1)).get(0);

        return Result.ok("获取个人宠物信息成功",list, total);
    }

    @GetMapping("/getPetInfoById")
    public Result getPetInfoById(int petId) {

        Pet pet = petService.getPetById(petId);
        if (pet != null) {
            return Result.ok("查找该宠物信息成功", pet, 1);
        }
        return Result.error("查找该宠物信息失败");
    }

}
