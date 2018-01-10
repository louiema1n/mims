package com.lms.mims.service.sys;

import com.lms.mims.domain.sys.Dict;
import com.lms.mims.mapper.sys.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:33
 */
@Service
public class DictService {

    @Autowired
    private DictMapper dictMapper;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-10 16:34
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Dict>
     */
    public List<Dict> queryAll() {
        return this.dictMapper.selectAll();
    }
}
