package com.example.pethis;

import com.aliyun.auth.credentials.Credential;
import com.aliyun.auth.credentials.provider.StaticCredentialProvider;
import com.aliyun.sdk.service.dysmsapi20170525.AsyncClient;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsResponse;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.EmployeeMapper;
import com.example.pethis.mapper.RoleMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.DutyService;
import com.example.pethis.service.PetService;
import com.example.pethis.utils.JwtUtils;
import com.example.pethis.utils.SendMail;
import com.google.gson.Gson;
import darabonba.core.client.ClientOverrideConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SpringBootTest
class PetHisApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    DutyService dutyService;
    @Resource
    PetService petService;
    @Resource
    RoleMapper roleMapper;
    @Resource
    EmployeeMapper employeeMapper;

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
    public void testmail() throws Exception {
        // Configure Credentials authentication information, including ak, secret, token
        StaticCredentialProvider provider = StaticCredentialProvider.create(Credential.builder()
                .accessKeyId(
                        "LTAI5tRUbk3MW1TYZNQmuhax")
                .accessKeySecret(
                        "QsvmydzFdu4D5EUYK9MV4Ty2G17WVT")
                //.securityToken("<your-token>") // use STS token
                .build());

        // Configure the Client
        AsyncClient client = AsyncClient.builder()
                .region("undefined") // Region ID
                //.httpClient(httpClient) // Use the configured HttpClient, otherwise use the default HttpClient (Apache HttpClient)
                .credentialsProvider(provider)
                //.serviceConfiguration(Configuration.create()) // Service-level configuration
                // Client-level configuration rewrite, can set Endpoint, Http request parameters, etc.
                .overrideConfiguration(
                        ClientOverrideConfiguration.create()
                                .setEndpointOverride("dysmsapi.aliyuncs.com")
                        //.setConnectTimeout(Duration.ofSeconds(30))
                )
                .build();

        // Parameter settings for API request
        SendSmsRequest sendSmsRequest = SendSmsRequest.builder()
                .phoneNumbers("18529225694")
                .signName("梁炜轩的个人博客")
                .templateCode("SMS_272635731")
                .templateParam("{\"code\":\"2567\"}")
                // Request-level configuration rewrite, can set Http request parameters, etc.
                // .requestConfiguration(RequestConfiguration.create().setHttpHeaders(new HttpHeaders()))
                .build();

        // Asynchronously get the return value of the API request
        CompletableFuture<SendSmsResponse> response = client.sendSms(sendSmsRequest);
        // Synchronously get the return value of the API request
        SendSmsResponse resp = response.get();
        System.out.println(new Gson().toJson(resp));
        // Asynchronous processing of return values
        /*response.thenAccept(resp -> {
            System.out.println(new Gson().toJson(resp));
        }).exceptionally(throwable -> { // Handling exceptions
            System.out.println(throwable.getMessage());
            return null;
        });*/

        // Finally, close the client
        client.close();
    }

    @Test
    void testmail2() throws ExecutionException, InterruptedException, NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        String str = "";
        for (int i = 0; i < 4; i++) {
            int num = secureRandom.nextInt(9);
            str += num;

        }
        System.out.println(str);
       String code="{\"code\":"+str+"}";
        System.out.println(code);
        String result = SendMail.sendCode("",
                "",
                "", code,
                "", "梁炜轩的个人博客");
        System.out.println(result);
    }


    @Test
    void testDuty() {
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

         */
    }

    @Test
    public void testJoin() {
        dutyService.getDutyPage(1, 3);

    }

    @Test
    public void testpetlist() {
        petService.getPetInfoList(1, 10);

    }

    @Test
    public void persoanPetList() {
        petService.getPetListByUserId(1, 2, 1);
    }

    @Test
    public void rolePerList() {
        roleMapper.getRoleInfoList(1, 2);
    }

    @Test
    public void roleEmpListByRolePAge() {
        employeeMapper.getEmployeeListByRoleId(1, 5, 1);
    }
}
