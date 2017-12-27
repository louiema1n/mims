package com.lms.mims.service.utils;

import com.lms.mims.utils.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description 文件上传/下载工具
 * @author&date Created by louiemain on 2017-12-27 10:16
 */
@Service
public class FileUtilService {

    @Value("${web.updPath}")
    private String updPath;

    /**
     * @description 上传
     * @author louiemain
     * @date Created on 2017-12-27 10:33
     * @param file
     * @return java.lang.String
     */
    public String uploadSingleFile(MultipartFile file) {
        String distName = new FileUtil().upload(file, updPath);
        if (distName != null) {
            // 格式化新文件名
            return "<a href=\"" + distName + "\">"+file.getOriginalFilename()+"</a>";
        }
        return null;
    }
}
