package com.example.pethis.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

   // @Value("${file.uploadPath}")
   // private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //添加资源映射规则，默认的前缀是：http://localhost:port
        registry.addResourceHandler("/petHis/file/upload/**")
                .addResourceLocations("file:E:/图片保存/upload/" );
        //这里就相等于设，http://localhost:port/file/upload/**
        // ** 默认掉用本地的 E:/图片保存/upload/**
    }
}
