package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.utils.FileUploadUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@CrossOrigin
@RestController
public class UploadFile {
    @PostMapping("/upload/file")
    public String saveImageLocal(@RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        String uploadDir = "Upload/" + "photo";//file will be save same folder with project (../Upload/photo)
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return uploadDir + "/"+ fileName;
    }

}
