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

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018/1/11 18:37
     * @param dict
     * @return java.lang.Integer
     */
    public Integer add(Dict dict) {
        return this.dictMapper.add(dict);
    }

    /**
     * @description 修改
     * @author louiemain
     * @date Created on 2018/1/11 18:37
     * @param dict
     * @return java.lang.Integer
     */
    public Integer upd(Dict dict) {
        return this.dictMapper.upd(dict);
    }
}
