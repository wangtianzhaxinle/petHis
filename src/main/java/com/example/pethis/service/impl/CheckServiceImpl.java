package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Check;
import com.example.pethis.service.CheckService;
import com.example.pethis.mapper.CheckMapper;
import org.springframework.stereotype.Service;

/**
* @author 梁炜轩
* @description 针对表【check】的数据库操作Service实现
* @createDate 2023-03-10 22:20:01
*/
@Service
public class CheckServiceImpl extends ServiceImpl<CheckMapper, Check>
    implements CheckService{

}




