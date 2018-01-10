package com.lms.mims.service.sys;

import com.lms.mims.domain.sys.Nav;
import com.lms.mims.mapper.sys.NavMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 系统导航
 * @author&date Created by louiemain on 2018-01-10 10:14
 */
@Service
public class NavService {

    @Autowired
    private NavMapper navMapper;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-10 10:15
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Nav>
     */
    public List<Nav> queryAll() {
        return this.navMapper.selectAll();
    }

    /**
     * @description 查询所有二级nav
     * @author louiemain
     * @date Created on 2018-01-10 16:03
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Nav>
     */
    public List<Nav> query2Nav() {
        return this.navMapper.select2Nav();
    }
}
