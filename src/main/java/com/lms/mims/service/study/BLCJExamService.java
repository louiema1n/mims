package com.lms.mims.service.study;

import com.lms.mims.domain.study.syllabus.BLCJExam;
import com.lms.mims.mapper.study.BLCJExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
