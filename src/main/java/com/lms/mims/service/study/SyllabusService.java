package com.lms.mims.service.study;

import com.lms.mims.domain.study.syllabus.Syllabus;
import com.lms.mims.mapper.study.SyllabusMapper;
import com.lms.mims.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:39
 */
@Service
public class SyllabusService {

    @Autowired
    private SyllabusMapper syllabusMapper;

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
        // System.getProperty("user.dir")-项目根目录
        return new JsonUtil().fromFileJson2String(System.getProperty("user.dir") + "/json/Pathologist-junior.json");
    }

    /**
     * @description 更新目录
     * @author louiemain
     * @date Created on 2018/1/14 21:10
     * @param json
     * @return void
     */
    public void updCatalog(String json) {
        new JsonUtil().jsonString2File(System.getProperty("user.dir") + "/json/Pathologist-junior.json", json);
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-13 11:01
     * @param syllabus
     * @return java.lang.String
     */
    public String add(Syllabus syllabus) {
        syllabus.setCreator("系统管理员");
        syllabus.setCreatdate(new Timestamp(new Date().getTime()));
        int i = this.syllabusMapper.add(syllabus);
        if (i > 0) {
            return "新增成功";
        }
        return "新增失败";
    }

    /**
     * @description 更新
     * @author louiemain
     * @date Created on 2018-01-13 11:02
     * @param syllabus
     * @return java.lang.String
     */
    public String upd(Syllabus syllabus) {
        int i = this.syllabusMapper.upd(syllabus);
        if (i > 0) {
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2018/1/14 12:11
     * @param syllabus
     * @return java.lang.String
     */
    public String del(Syllabus syllabus) {
        int i = this.syllabusMapper.del(syllabus);
        if (i > 0) {
            return "删除成功";
        }
        return "删除失败";
    }

    /**
     * @description 根据search查询
     * @author louiemain
     * @date Created on 2018/1/15 21:41
     * @param search
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Syllabus>
     */
    public List<Syllabus> queryBySearch(String search) {
        return this.syllabusMapper.selectBySearch(search);
    }
}
