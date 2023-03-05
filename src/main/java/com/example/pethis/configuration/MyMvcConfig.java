package com.example.pethis.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //http://localhost:8080/petHis/uploadImage/1.jpg
   @Value("${image.upload}")
    private String imageUrl;
   //file:///F:/locationImage/1.jpg
    @Value("${image.location}")
    private String locationImagePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //添加资源映射规则，默认的前缀是：http://localhost:port
        //前缀http://localhost:8080/petHis
        //http://localhost:8080/petHis/file/1.jpg
        //file:///F:/uploadfile/1.jpg
        registry.addResourceHandler(imageUrl+"**")
                .addResourceLocations("file:"+locationImagePath );
        //这里就相等于设，http://localhost:port/file/upload/**
        // ** 默认掉用本地的 E:/图片保存/upload/**
    }
}
