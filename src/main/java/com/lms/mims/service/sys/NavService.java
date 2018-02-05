package com.lms.mims.service.sys;

import com.lms.mims.domain.sys.Sysnav;
import com.lms.mims.mapper.sys.SysnavMapper;
import com.lms.mims.service.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 系统导航
 * @author&date Created by louiemain on 2018-01-10 10:14
 */
@Service
public class NavService extends BaseService<Sysnav> {

    @Autowired
    private SysnavMapper sysnavMapper;

    /**
     * @description 查询所有二级nav
     * @author louiemain
     * @date Created on 2018-01-10 16:03
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Nav>
     */
    public List<Sysnav> query2Nav() {
        return this.sysnavMapper.select2Nav();
    }
}
