package com.lms.mims.controller.utils;

/**
 * @description 文件上传/下载相关
 * @author&date Created by louiemain on 2017-12-27 10:17
 */

import com.lms.mims.domain.ResultSet;
import com.lms.mims.service.utils.FileUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileUtilController {

    @Autowired
    private FileUtilService fileUtilService;

    /**
     * @description 单文件上传
     * @author louiemain
     * @date Create on 2017-12-27 10:21
     * @param file
     * @return java.lang.String
     */
    @RequestMapping(value = "/upload/single", method = RequestMethod.POST)
    public ResultSet<String> updSingleFile(@RequestParam("file") MultipartFile file) {
        ResultSet<String> res = new ResultSet<>();
        List<String> data = new ArrayList<>();
        if (file.isEmpty()) {
            res.setCode(1);
        } else {
            String distname = this.fileUtilService.uploadSingleFile(file);
            if (distname == null) {
                res.setCode(1);
            } else {
                res.setCode(0);
                res.setMsg("上传成功");
                data.add(distname);
                res.setData(data);
            }
        }
        return res;
    }

    /**
     * @description 多文件上传
     * @author louiemain
     * @date Created on 2017-12-27 11:40
     * @param request
     * @return com.lms.mims.domain.ResultSet<java.lang.String>
     */
    @RequestMapping(value = "/upload/batch", method = RequestMethod.POST)
    public ResultSet<String> updBatchFile(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        ResultSet<String> res = new ResultSet<>();
        List<String> data = new ArrayList<>();
        if (files.size() == 0) {
            res.setCode(1);
        } else {
            for (MultipartFile file:files) {
                res.setCode(0);
                if (!file.isEmpty()) {
                    String distName = this.fileUtilService.uploadSingleFile(file);
                    data.add(distName);
                } else {
                    data.add("空文件");
                }
            }
            res.setData(data);
        }
        return res;
    }
}
