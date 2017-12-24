package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Standard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 自查标准mapper
 */
public interface StandardMapper {

    @Select("select * from standard")
    List<Standard> selectAll();

    @Select("select * from standard where stdid = #{stdid}")
    Standard selectById(@Param("stdid") int stdid);
}
