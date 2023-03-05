package com.example.pethis.controller;

import com.example.pethis.utils.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @projectName: petHis
 * @package: com.example.pethis.controller
 * @className: ImageController
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/4 20:16
 * @version: 1.0
 */
@RestController
@RequestMapping("/upload")
public class ImageController {
    //http://localhost:8080/petHis/uploadImage/1.jpg
    @Value("${image.upload}")
    private String imageUrl;
    //file:///F:/locationImage/1.jpg
    @Value("${image.location}")
    private String locationImagePath;

    @RequestMapping("/image")
    public Result addArticleImg(MultipartFile file) {
        System.out.println("接受图片中");
        if(file==null){
            System.out.println("图片为空");
            return Result.error("图片为空");
        }else {
            System.out.println("接收到图片");
            Map<String, Object> map = uploadFile(file);
            String fileUrl = (String) map.get("fileUrl");
            System.out.println("返回url为"+fileUrl);
            return Result.ok("上传图片成功", fileUrl, 1);
        }
    }

    private Map<String, Object> uploadFile(MultipartFile file) {

        // 这个map用于返回imageUrl，imageId之类的数据
        Map<String, Object> map = new HashMap<>();
        try {
            // 1）设置文件的目录
            //按照月份进行分类：
           /* Calendar calendar = Calendar.getInstance();
            calendar.get(Calendar.YEAR);
            String yearMonth = calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月";
            String filePath = "E:\\图片保存\\upload\\" + yearMonth; //项目路径+年月份
*/
            // 创建文件目录
            File realPath = new File(locationImagePath);  //上传文件保存地址：realPath = "F:/uploadfile/1.jpg"
            if (!realPath.exists()) {
                boolean mkdirs = realPath.mkdirs();//创建文件目录，可以创建多层目录
            }

            //2）设置文件名字
            String fileRealName = file.getOriginalFilename();
            String suffix = fileRealName.substring(fileRealName.lastIndexOf(".") + 1);  //后缀  jpg  png
            //解决文件名字问题：使用uuid的方式;
            String fileName = "file-" + UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;

            //3）进行文件保存，通过CommonsMultipartFile的方法直接写文件
            file.transferTo(new File(realPath + "/" + fileName));

            //4）返回图片的名字，url，如果只是保存文件，下面的语句可以不写
            String fileUrl = imageUrl  + fileName;
            //前端的FILE_API为http://localhost:9222/file
          //  map.put("fileName", fileName);
            map.put("fileUrl", fileUrl);  //传到前端的url，例如： /upload/2022年5月/xxx.jpg

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}