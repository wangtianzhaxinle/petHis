package com.example.pethis;

import com.example.pethis.entity.User;
import com.example.pethis.mapper.UserMapper;
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
    void curdUser(){
    User user=userMapper.selectById("12000019720905275X");
    List<User>list=userMapper.selectList(null);


}
}
