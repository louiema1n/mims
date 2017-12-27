package com.lms.mims.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @description 文件上传/下载工具类
 * @author&date Created by louiemain on 2017-12-27 9:59
 */
public class FileUtil {

    /**
     * @description 文件上传
     * @author louiemain
     * @date Create on 2017-12-27 10:01
     * @param file 需要上传的文件
     * @param updPath 上传的路径
     * @return java.lang.String
     */
    public String upload(MultipartFile file, String updPath) {
        // 获取文件名
        String filename = file.getOriginalFilename();
        // 格式化新文件名，避免重复
        String suf = filename.substring(filename.lastIndexOf("."));
        String dateStr = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        String newFn = "/" + dateStr + UUID.randomUUID() + suf;
        // 创建目标文件
        File dist = new File(updPath + newFn);
        if (!dist.getParentFile().exists()) {
            // 不存在，则创建
            dist.getParentFile().mkdirs();
        }
        // 读写文件
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(dist));
            bos.write(file.getBytes());
            bos.flush();
            bos.close();
            return newFn;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
