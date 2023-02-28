package com.example.pethis;

import com.example.pethis.entity.User;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.utils.JwtUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class PetHisApplicationTests {
    @Resource
    private UserMapper userMapper;

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
       String username=JwtUtils.getUsername(str);
        System.out.println(username );
    }
}
