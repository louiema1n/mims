package com.lms.mims.service.study;

import com.lms.mims.domain.study.syllabus.BLCJExam;
import com.lms.mims.mapper.study.BLCJExamMapper;
import com.lms.mims.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-23 9:47
 */
@Service
public class BLCJExamService {

    @Autowired
    private BLCJExamMapper blcjExamMapper;

    /**
     * @description 根据id查询
     * @author louiemain
     * @date Created on 2018-01-23 9:48
     * @param id
     * @return com.lms.mims.domain.study.syllabus.BLCJExam
     */
    public BLCJExam queryById(int id) {
        return this.blcjExamMapper.selectById(id);
    }

    /**
     * @description 从本地json文件获取examCatalog
     * @author louiemain
     * @date Created on 2018-01-29 9:54
     * @param
     * @return java.lang.String
     */
    public String getExamCatalog() {
        return new JsonUtil().fromFileJson2String(System.getProperty("user.dir") + "/json/examCatalog.json");
    }

    /**
     * @description 根据catalog查询
     * @author louiemain
     * @date Created on 2018-01-29 10:20
     * @param catalog
     * @return java.util.List<com.lms.mims.domain.study.syllabus.BLCJExam>
     */
    public List<BLCJExam> getTopicByCatalog(String catalog) {
        return this.blcjExamMapper.selectByCatalog(catalog);
    }
}
