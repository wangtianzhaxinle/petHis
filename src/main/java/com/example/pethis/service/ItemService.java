package com.example.pethis.service;

import com.example.pethis.entity.Item;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【item】的数据库操作Service
* @createDate 2023-03-03 01:59:43
*/
public interface ItemService extends IService<Item> {

    List<Item> getItemInfoList();
}
