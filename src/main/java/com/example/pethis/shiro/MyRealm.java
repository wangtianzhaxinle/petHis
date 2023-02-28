package com.example.pethis.shiro;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.pethis.service.UserService;
import com.example.pethis.utils.JwtToken;
import com.example.pethis.utils.JwtUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: smalabel-backend
 * @description:
 * @author:
 * @create:
 **/
@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    //
    @Override
    public boolean supports(AuthenticationToken token) {

        System.out.print("MyRealm中supports结果为");
        System.out.println(token instanceof JwtToken);
        return token instanceof JwtToken;
    }

    /**
     * 只有当检测用户需要权限或者需要判定角色的时候才会走
     * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("MyRealm doGetAuthorizationInfo() 方法授权 ");
        String token = principalCollection.toString();
        String username = JwtUtils.getClaim(token,"username");
        if (StringUtils.isBlank(username)) {
            throw new AuthenticationException("token认证失败");
        }
        //查询当前
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //其实这里应该是查询当前用户的角色或者权限去的,意思就是将当前用户设置一个svip和vip角色
        //权限设置一级权限和耳机权限 正常来说应该是去读取数据库只添加当前用户的角色权限的 
        info.addRole("vip");
        info.addRole("svip");
        info.addStringPermission("一级权限");
        info.addStringPermission("二级权限");
        System.out.println("方法结束咯-------》》》");

        return info;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证, 如果没有权限注解的话就不会去走上面的方法只会走这个方法
     * 其实就是 过滤器传过来的token 然后进行 验证 authenticationToken.toString() 获取的就是
     * 你的token字符串,然后你在里面做逻辑验证就好了,没通过的话直接抛出异常就可以了
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证-----------》》》》");
        System.out.println("1.toString ------>>> " + authenticationToken.toString());
        System.out.println("2.getCredentials ------>>> " + authenticationToken.getCredentials().toString());
        System.out.println("3. -------------》》 " +authenticationToken.getPrincipal().toString());
        String jwt = (String) authenticationToken.getCredentials();

//        if (!JwtUtils.verify(jwt)) {
//            throw new AuthenticationException("Token认证失败");
//        }

        return new SimpleAuthenticationInfo(jwt, jwt, "MyRealm");
    }
}

