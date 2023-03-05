package com.example.pethis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Item;
import com.example.pethis.service.ItemService;
import com.example.pethis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        Page<Item> itemList=itemService.getItemInfoList(pageNum,pageSize);
        System.out.println("itemList:"+itemList);
        return Result.ok("获取项目信息成功",itemList.getRecords(),itemList.getTotal());

    }
    @PostMapping("/addItem")
    public Result addItem(@RequestBody Item item){
        System.out.println("addItem");
        System.out.println(item);
        int rows= itemService.addItem(item);
        if(rows>0){
            return Result.ok("添加项目成功",null,1);
        }

        return Result.error("添加项目失败");

    }
    @DeleteMapping("/deleteItembyId")
    public Result deleteItembyId(int id){
        System.out.println("deleteItembyId");
        System.out.println(id);
        int rows=itemService.deleteItembyId(id);
        if(rows>0){

            return Result.ok("删除项目成功",null,1);
        }
        return Result.error("删除项目失败");

    }
    @PostMapping("/updateItemById")
    public Result updateItemById(@RequestBody Item item){
        System.out.println("updateItemById");
        System.out.println(item);

        int rows=itemService.updateItemById(item);
        if(rows>0){
            return Result.ok("修改项目成功",null,1);
        }
        return Result.error("修改项目失败");

    }



}
