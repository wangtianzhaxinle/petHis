package com.example.pethis.controller;

import com.example.pethis.entity.Duty;
import com.example.pethis.service.DutyService;
import com.example.pethis.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/duty")
public class DutyController {

    @Resource
    DutyService dutyService;

    @GetMapping("/getDutyList")
    public Result getDutyList() {

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

        map.put(" sundayAMDuty", sundayAMDuty);
        map.put(" sundayPMDuty", sundayPMDuty);
        map.put(" mondayAMDuty", mondayAMDuty);
        map.put(" mondayPMDuty", mondayPMDuty);
        map.put(" tuesdayAMDuty", tuesdayAMDuty);
        map.put(" tuesdayPMDuty", tuesdayPMDuty);
        map.put(" wednesdayAMDuty", wednesdayAMDuty);
        map.put(" wednesdayPMDuty", wednesdayPMDuty);
        map.put(" thursdayAMDuty ", thursdayAMDuty);
        map.put(" thursdayPMDuty ", thursdayPMDuty);
        map.put(" fridayAMDuty", fridayAMDuty);
        map.put(" fridayPMDuty", fridayPMDuty);
        map.put(" saturdayAMDuty", saturdayAMDuty);
        map.put(" saturdayPMDuty", saturdayPMDuty);
        return Result.ok("获取值班信息成功",map,1);
    }

}
