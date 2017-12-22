package com.lms.mims.service;

import com.lms.mims.domain.Secareview;
import com.lms.mims.mapper.SecareviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecareviewService {

    @Autowired
    private SecareviewMapper secareviewMapper;

    /**
     * 查询所有Secareview
     * @return
     */
    public List<Secareview> queryAll() {
        return this.secareviewMapper.selectAll();
    }
}
