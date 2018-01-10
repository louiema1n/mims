package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Dict;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:32
 */
public interface DictMapper {

    @Select("select * from dict")
    List<Dict> selectAll();

    @Select("select * from dict where navid = #{navid}")
    List<Dict> selectByNavid(@Param("navid") int navid);
}
