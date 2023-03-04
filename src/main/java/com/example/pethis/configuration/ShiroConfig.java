package com.example.pethis.configuration;


import com.example.pethis.shiro.JwtFilter;
import com.example.pethis.shiro.MyRealm;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @program: smalabel-backend
 * @description:
 * @author: 孙靖淳
 * @create: 2021-10-26 16:52
 **/
@Configuration
public class ShiroConfig {
    /**
     * 注入 securityManager
     */
    @Bean("securityManager")
    public DefaultWebSecurityManager securityManager(MyRealm myRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置自定义 realm.
        securityManager.setRealm(myRealm);
        // 关闭shiro自带的session
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
        securityManager.setSubjectDAO(subjectDAO);
        return securityManager;
    }


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        //添加自己的过滤器 并且取名为filter
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        //设置自定义的JWT过滤器
        filterMap.put("jwt", new JwtFilter());
        factoryBean.setFilters(filterMap);
        factoryBean.setSecurityManager(securityManager);

        //设置无权限跳转的url 权限验证如果没权限跳转  
        factoryBean.setUnauthorizedUrl("/noRole");
        Map<String, String> filterRuleMap = new LinkedHashMap<>();

        //设置需要通过过滤器的请求 /**意思是 所有请求接口都通过自定义的jwt过滤器
        //anon的意思是 不需要走这一套逻辑 自己配置就好了
        //这个位置这样设置filterRuleMap.put("/user/login", "anon");
        //原本能访问到控制器突然不能访问了
        //想了一整天,终于在现在2023年3月5日12:42发现
        //原来是我自定义的过滤器JwtFilter里面的preHandle设置了解决跨域的问题
        //然后当我使用anon匿名访问以后,因为不经过自定义的JwtFilte,所以也不会使用preHandle里面解决跨域的方法了
        //所以因为跨域问题,在设置了登录接口匿名访问后,本应该直接访问对应的控制器方法的,结果因为跨域问题,连方法里面
        //都没进去,也没有打印控制台,所以一切的罪魁祸首都是因为跨域问题啊
        //我的天,但凡我早点看两眼控制太也不至于被烦到现在,我一开始的思路是可能是被shiro莫名奇妙的拦截了,
        //又或者是因为自定义过滤器所以"anon"失效,甚至想到前端的问题,
        //最后只在UserController的login方法上加上注解@CrossOrigin(origins = "*")
        //就解决了,我把猜测用snipa截图后写在上面了

      filterRuleMap.put("/user/login", "anon");

        //filterRuleMap.put("/file/upload/**", "anon");
       // filterRuleMap.put("/test/111", "anon");
        filterRuleMap.put("/**", "jwt");
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }


    /**
     * 添加注解支持
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {

        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {

        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}