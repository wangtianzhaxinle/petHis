package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Prescribe;
import com.example.pethis.mapper.PrescribeMapper;
import com.example.pethis.service.PrescribeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 梁炜轩
 * @description 针对表【prescribe】的数据库操作Service实现
 * @createDate 2023-03-03 01:59:43
 */
@Service
public class PrescribeServiceImpl extends ServiceImpl<PrescribeMapper, Prescribe>
        implements PrescribeService {
    @Resource
    PrescribeMapper prescribeMapper;

    @Override
    public int addPrescribe(Prescribe prescribe) {
        return prescribeMapper.insert(prescribe);
    }

    @Override
    public int deletePrescribeById(int id) {
        return prescribeMapper.deleteById(id);
    }

    @Override
    public Page<Prescribe> getPrescribeList(int pageNum, int pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Prescribe> page = new Page<>(pageNum, pageSize);
        return prescribeMapper.selectPage(page, wrapper);
    }
}




