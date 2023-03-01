package com.example.pethis;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Duty;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.DutyService;
import com.example.pethis.utils.JwtUtils;
import org.apache.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class PetHisApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    DutyService dutyService;

    @Test
    void contextLoads() {
    }

    @Test
    void curdUser() {
        User user = userMapper.selectById("12000019720905275X");
        List<User> list = userMapper.selectList(null);


    }

    @Test
    public void test() {
        String str = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXNzd29yZCI6IjExMTExMSIsImV4cCI6MTY3NzU3NDA5OCwiaWF0IjoxNjc3NTYzMjk4LCJ1c2VybmFtZSI6ImFkbWluIn0.1SD7AqHcjJCpTU8I0Higtt2d4pjy4dOhuldfDsypUoM";
        String username = JwtUtils.getUsername(str);
        System.out.println(username);
    }

    @Test
    public void testpage() {
        int pageNum = 1;
        int pagesize = 10;
        Page<User> page = new Page<>(pageNum, pagesize);
        Page<User> userPage = userMapper.selectPage(page, null);
        System.out.println(userPage);

    }

    //短信验证码测试
    @Test
    public void testmail() {
        String host = "https://zwp.market.alicloudapi.com";
        String path = "/sms/sendv2";
        String method = "GET";
        String appcode = "4d2797ea8a7b437ab28cbc951f8e4c24";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("content", "【儿童教务】您正在登录验证,验证码为3256 ,60s内有效,请尽快验证。");
        querys.put("mobile", "1343994XXXX");


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = com.aliyun.api.gateway.demo.util.HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    void testDuty() {
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

        System.out.println("sundayAMDuty   " + sundayAMDuty);
        System.out.println("sundayPMDuty   " + sundayPMDuty);

        System.out.println("mondayAMDuty   " + mondayAMDuty);
        System.out.println("mondayPMDuty   " + mondayPMDuty);

        System.out.println("tuesdayAMDuty  " + tuesdayAMDuty);
        System.out.println("tuesdayPMDuty  " + tuesdayPMDuty);

        System.out.println("wednesdayAMDuty" + wednesdayAMDuty);
        System.out.println("wednesdayPMDuty" + wednesdayPMDuty);

        System.out.println("thursdayAMDuty " + thursdayAMDuty);
        System.out.println("thursdayPMDuty " + thursdayPMDuty);

        System.out.println("fridayAMDuty   " + fridayAMDuty);
        System.out.println("fridayPMDuty   " + fridayPMDuty);

        System.out.println("saturdayAMDuty " + saturdayAMDuty);
        System.out.println("saturdayPMDuty " + saturdayPMDuty);
    }
}
