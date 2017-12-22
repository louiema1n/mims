package com.lms.mims.mapper;

import com.lms.mims.domain.Project;
import com.lms.mims.domain.Secareview;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 二甲评审mapper
 */
public interface SecareviewMapper {

    @Select("select * from secareview")
    List<Secareview> selectAll();

    @Select("select * from secareview where rid = #{prjid}")
    Project selectById(@Param("prjid") int prjid);
}
