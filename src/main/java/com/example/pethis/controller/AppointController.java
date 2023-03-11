package com.example.pethis.controller;

import com.example.pethis.service.AppointService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/appoint")
public class AppointController {
    @Resource
    AppointService appointService;
    //这里莫名其妙一直访问不了地址,然后重启一下后端就行了??????
    /*
    @GetMapping("/getAppointList")
    public Result getAppointList(Integer pageNum, Integer pageSize) {
        System.out.println("getAppointList");
        Page<Appoint> appointPage = appointService.getAppointList(pageNum, pageSize);

        return Result.ok("查找预约信息成功", appointPage.getRecords(), appointPage.getSize());
    }

    @GetMapping("/getAppointInfoById")
    public Result getAppointInfoById(Integer appointId) {
        System.out.println("getAppointInfoById");
        Appoint appoint = appointService.getAppointInfoById(appointId);
        if (appoint == null) {
            return Result.error("查找该预约信息失败");
        }
        return Result.ok("查找该预约信息成功", appoint, 1);
    }

    @PostMapping("/addAppoint")
    public Result addAppoint(@RequestBody Appoint appoint) {
        System.out.println("addAppoint");
        System.out.println(appoint);
       /* int rows= appointService.addAppoint(appoint);
        if (rows <=0) {
            return Result.error("添加该预约信息失败");
        }*/
      //  return Result.ok("添加该预约信息成功", null
        //        , 1);
   // }

}
