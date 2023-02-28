package com.example.pethis.controller;

import com.example.pethis.entity.User;
import com.example.pethis.service.UserService;
import com.example.pethis.utils.JwtUtils;
import com.example.pethis.utils.Result;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping(value = "/login")
    public Result login(@RequestBody User user) throws UnsupportedEncodingException {
        //获取主题对象
        System.out.println("UserController执行login");

        System.out.println("账号密码" + user);
        User user1 = userService.selectUserByUsername(user.getUsername());
        Assert.notNull(user, "用户名或密码错误");

        String token = JwtUtils.createToken(user.getUsername(), user.getPassword());
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        return Result.ok("登录成功", map, 1);


    }

    @GetMapping("/info")
    public Result getInfo(String token) {
      /*  List<String> list = new ArrayList<>();
        list.add("admin");
        Map<String, Object> map = new HashMap();
        map.put("roles", list);
        map.put("introduction", "I am a super administrator");
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("name", "Super Admin");
        Map<String, Object> map2 = new HashMap();
        map2.put("code", 20000);
        map2.put("data", map);

        return map2;*/
        String username = JwtUtils.getUsername(token);
        User user = userService.selectUserByUsername(username);
        System.out.println(user);
        return Result.ok("获取个人信息成功", user, 1);


    }

    @PostMapping("/logout")
    public Result logout() {
        System.out.println("退出登录中");
        return Result.ok();
    }

    @GetMapping("/getUserInfoList")
    public Result getUserInfoList( Integer pageNum,Integer pageSize) {
        System.out.println("pageNum="+pageNum);
        System.out.println("pageSize="+pageSize);
        List<User> userList = userService.selectAllUserInfo();
        return Result.ok("查询所有用户信息成功", userList, userList.size());
    }
    @DeleteMapping("/deleteUserById/{user_id}")
    public Result deleteUserById(@PathVariable String user_id){
        System.out.println("deleteUserById");
        int rows=userService.delectUserById(user_id);
        if(rows>0){
            return Result.ok("删除用户成功",null,0);
        }
        return Result.error("删除用户失败");
    }
    @PutMapping("/updateUserById")
    public Result updateUserById(User user){
        int rows=userService.updateUserById(user);
        if(rows>0){
            return Result.ok("更新用户成功",null,0);
        }
        return Result.error("更新用户失败");
    }

}
