package com.lms.mims.service.life;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.life.Economic;
import com.lms.mims.mapper.life.EconomicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 经济管理
 * @author&date Created by louiemain on 2018-01-03 10:26
 */
@Service
public class EconomicService {

    @Autowired
    private EconomicMapper economicMapper;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-03 11:19
     * @param
     * @return com.lms.mims.domain.ResultSet<com.lms.mims.domain.life.Economic>
     */
    public ResultSet<Economic> queryAll() {
        ResultSet<Economic> resultSet = new ResultSet<>();
        List<Economic> economics = this.economicMapper.selectAll();
        resultSet.setCode(0);
        resultSet.setMsg("查询成功");
        resultSet.setCount(economics.size());
        resultSet.setData(economics);
        return resultSet;
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-03 15:45
     * @param economic
     * @return java.lang.Integer
     */
    public Integer add(Economic economic) {
        return this.economicMapper.add(economic);
    }

    /**
     * @description 修改
     * @author louiemain
     * @date Created on 2018-01-03 15:45
     * @param economic
     * @return java.lang.Integer
     */
    public Integer upd(Economic economic) {
        return this.economicMapper.upd(economic);
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2018-01-03 15:46
     * @param ecoid
     * @return java.lang.Integer
     */
    public Integer del(int ecoid) {
        return this.economicMapper.delById(ecoid);
    }
}
