package com.lms.mims.service.sys;

import com.lms.mims.domain.sys.Dict;
import com.lms.mims.mapper.sys.DictMapper;
import com.lms.mims.service.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:33
 */
@Service
public class DictService extends BaseService<Dict> {

    @Autowired
    private DictMapper dictMapper;

    /**
     * @description 根据navid查询
     * @author louiemain
     * @date Created on 2018-02-05 14:50
     * @param navid
     * @return java.util.List<com.lms.mims.domain.sys.Dict>
     */
    public List<Dict> getByNavId(int navid) {
        Dict dict = new Dict();
        dict.setNavid(navid);
        return this.dictMapper.select(dict);
    }
}
