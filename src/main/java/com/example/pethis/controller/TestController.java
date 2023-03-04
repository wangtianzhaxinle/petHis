package com.example.pethis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: petHis
 * @package: com.example.pethis.controller
 * @className: TestController
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/5 0:22
 * @version: 1.0
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("111")
    public String aaa(){
        System.out.println("test111");
        return "111";
    }
}
