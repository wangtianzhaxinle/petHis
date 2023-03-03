package com.example.pethis.controller;

import com.example.pethis.entity.DutyVO;
import com.example.pethis.service.DutyService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/duty")
public class DutyController {

    @Resource
    DutyService dutyService;

    @GetMapping("/getDutyList")
    public Result getDutyList(int pageNum,int pageSize) {
/*
        List<Duty> sundayAMDuty = dutyService.getSundayAMDuty();
        List<Duty> sundayPMDuty = dutyService.getSundayPMDuty();

        List<Duty> mondayAMDuty = dutyService.getMondayAMDuty();
        List<Duty> mondayPMDuty = dutyService.getMondayPMDuty();

        List<Duty> tuesdayAMDuty = dutyService.getTuesdayAMDuty();
        List<Duty> tuesdayPMDuty = dutyService.getTuesdayPMDuty();

        List<Duty> wednesdayAMDuty = dutyService.getWednesdayAMDuty();
        List<Duty> wednesdayPMDuty = dutyService.getWednesdayPMDuty();

        List<Duty> thursdayAMDuty = dutyService.getThursdayAMDuty();
        List<Duty> thursdayPMDuty = dutyService.getThursdayPMDuty();

        List<Duty> fridayAMDuty = dutyService.getFridayAMDuty();
        List<Duty> fridayPMDuty = dutyService.getFridayPMDuty();

        List<Duty> saturdayAMDuty = dutyService.getSaturdayAMDuty();
        List<Duty> saturdayPMDuty = dutyService.getSaturdayPMDuty();
        Map<String, List<Duty>> map = new HashMap<>();
//这里key里面多了个空格结果前端一直获取不到值比如这样双引号里面多了个空格" sundayAMDuty"
        map.put("sundayAMDuty", sundayAMDuty);
        map.put("sundayPMDuty", sundayPMDuty);
        map.put("mondayAMDuty", mondayAMDuty);
        map.put("mondayPMDuty", mondayPMDuty);
        map.put("tuesdayAMDuty", tuesdayAMDuty);
        map.put("tuesdayPMDuty", tuesdayPMDuty);
        map.put("wednesdayAMDuty", wednesdayAMDuty);
        map.put("wednesdayPMDuty", wednesdayPMDuty);
        map.put("thursdayAMDuty", thursdayAMDuty);
        map.put("thursdayPMDuty ", thursdayPMDuty);
        map.put("fridayAMDuty", fridayAMDuty);
        map.put("fridayPMDuty", fridayPMDuty);
        map.put("saturdayAMDuty", saturdayAMDuty);
        map.put("saturdayPMDuty", saturdayPMDuty);

 */
        System.out.println("getDutyList");

        List<Object> objectList=dutyService.getDutyPage(pageNum,pageSize);
        List<DutyVO> list =(List<DutyVO>) objectList.get(0);
        int total =(Integer)((List<Object>)objectList.get(1)).get(0);

        return Result.ok("获取值班信息成功",list, total);
    }

}
