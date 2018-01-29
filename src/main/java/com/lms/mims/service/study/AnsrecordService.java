package com.lms.mims.service.study;

import com.lms.mims.domain.study.syllabus.Ansrecord;
import com.lms.mims.mapper.study.AnsrecodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-26 16:06
 */
@Service
public class AnsrecordService {

    @Autowired
    private AnsrecodMapper ansrecodMapper;

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-26 16:07
     * @param ansrecord
     * @return java.lang.Integer
     */
    public Integer add(Ansrecord ansrecord) {
        return this.ansrecodMapper.add(ansrecord);
    }

    /**
     * @description 根据当前用户及题目id查询
     * @author louiemain
     * @date Created on 2018-01-26 16:41
     * @param examid
     * @param anser
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Ansrecord>
     */
    public List<Ansrecord> getByExamidAndAnser(int examid, String anser) {
        return this.ansrecodMapper.selectByExamidAndAnser(examid, anser);
    }

    /**
     * @description 根据ansid查询
     * @author louiemain
     * @date Created on 2018-01-27 23:45
     * @param ansid
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Ansrecord>
     */
    public List<Ansrecord> getByAnsid(String ansid) {
        return this.ansrecodMapper.selectByAnsid(ansid);
    }

    /**
     * @description 根据flag、examid查询
     * @author louiemain
     * @date Created on 2018-01-29 17:06
     * @param examid
     * @param anser
     * @param flag
     * @return com.lms.mims.domain.study.syllabus.Ansrecord
     */
    public Ansrecord getByExamidAndFlag(int examid, String anser, int flag) {
        return this.ansrecodMapper.selectByExamidAndFlag(examid, anser, flag);
    }
}
