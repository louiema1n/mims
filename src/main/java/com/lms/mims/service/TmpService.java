package com.lms.mims.service;

import com.lms.mims.domain.Tmp;
import com.lms.mims.mapper.TmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TmpService {

    @Autowired
    private TmpMapper tmpMapper;

    /**
     * 查询所有tmpitem
     * @return
     */
    public List<Tmp> queryAll() {
        return this.tmpMapper.selectAll();
    }
}
