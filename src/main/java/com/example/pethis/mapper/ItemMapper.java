package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Item;

import java.util.List;

/**
* @author 梁炜轩
* @description 针对表【item】的数据库操作Mapper
* @createDate 2023-03-03 01:59:42
* @Entity com.example.pethis.entity.Item
*/
public interface ItemMapper extends BaseMapper<Item> {
    List<Object > getitemList(int currentPage,int pageSize);

}




