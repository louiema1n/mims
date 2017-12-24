package com.lms.mims.service.work;

import com.lms.mims.domain.work.Selfexam;
import com.lms.mims.mapper.work.SelfexamMapper;
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

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    public Selfexam queryById(int sid) {
        return this.selfexamMapper.selectById(sid);
    }
}
