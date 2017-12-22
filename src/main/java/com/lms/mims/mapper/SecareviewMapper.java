package com.lms.mims.mapper;

import com.lms.mims.domain.Secareview;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * 二甲评审mapper
 */
public interface SecareviewMapper {

    @Select("select * from secareview")
    List<Secareview> selectAll();

    @Select("select * from secareview where rid = #{rid}")
    Secareview selectById(@Param("rid") int rid);

}
