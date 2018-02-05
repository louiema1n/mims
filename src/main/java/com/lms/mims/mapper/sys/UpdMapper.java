package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Upd;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UpdMapper extends Mapper<Upd> {

    @Select("SELECT * from upd WHERE updid = (select max(updid) from upd)")
    Upd selectMaxId();
}