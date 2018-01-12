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

    /**
     * @description 根据id查询
     * @author louiemain
     * @date Created on 2018-01-12 9:06
     * @param id
     * @return com.lms.mims.domain.sys.Dict
     */
    public Dict queryById(int id) {
        return this.dictMapper.selectById(id);
    }

    /**
     * @description 根据navid查询
     * @author louiemain
     * @date Created on 2018-01-12 9:30
     * @param navid
     * @return java.util.List<com.lms.mims.domain.sys.Dict>
     */
    public List<Dict> queryByNavid(int navid) {
        return this.dictMapper.selectByNavid(navid);
    }
}
