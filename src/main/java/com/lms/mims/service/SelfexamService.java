package com.lms.mims.service;

import com.lms.mims.domain.Selfexam;
import com.lms.mims.mapper.SelfexamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfexamService {

    @Autowired
    private SelfexamMapper selfexamMapper;

    /**
     * 查询所有Selfexam
     * @return
     */
    public List<Selfexam> queryAll() {
        return this.selfexamMapper.selectAll();
    }
}
