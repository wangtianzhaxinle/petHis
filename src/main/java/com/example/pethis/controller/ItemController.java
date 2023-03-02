package com.example.pethis.controller;

import com.example.pethis.entity.Item;
import com.example.pethis.service.ItemService;
import com.example.pethis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/getItemInfoList")
    public Result getItemInfoList(Integer pageNum,Integer pageSize){
        System.out.println("getItemInfoList");
        System.out.println("pageNum="+pageNum);
        System.out.println("pageSize="+pageSize);
        List<Item>itemList=itemService.getItemInfoList();
        System.out.println("itemList:"+itemList);
        return Result.ok("获取项目信息成功",itemList,itemList.size());

    }

}
