package com.lms.mims.service.work;

import com.lms.mims.domain.work.Standard;
import com.lms.mims.mapper.work.StandardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardService {

    @Autowired
    private StandardMapper standardMapper;

    /**
     * 查询所有
     * @return
     */
    public List<Standard> queryAll() {
        return this.standardMapper.selectAll();
    }

    /**
     * 根据id查询
     * @param stdid
     * @return
     */
    public Standard queryById(int stdid) {
        return this.standardMapper.selectById(stdid);
    }
}