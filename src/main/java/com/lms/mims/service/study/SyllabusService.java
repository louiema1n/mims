package com.lms.mims.service.study;

import com.lms.mims.domain.study.syllabus.Syllabus;
import com.lms.mims.mapper.study.SyllabusMapper;
import com.lms.mims.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:39
 */
@Service
public class SyllabusService {

    @Autowired
    private SyllabusMapper syllabusMapper;

    // 读取classpath下文件
    @Value(value = "classpath:/json/Pathologist-junior.json")
    private Resource resource;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018/1/12 19:41
     * @param
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Syllabus>
     */
    public List<Syllabus> queryAll() {
        return this.syllabusMapper.selectAll();
    }

    /**
     * @description 获取目录
     * @author louiemain
     * @date Created on 2018/1/12 20:29
     * @param
     * @return java.lang.String
     */
    public String getCatalog() {
        return new JsonUtil().fromFileJson2String(resource);
    }
}
