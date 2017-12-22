package com.lms.mims.mapper;

import com.lms.mims.domain.Selfexam;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 自查mapper
 */
public interface SelfexamMapper {

    @Select("select * from selfexam")
    @Results(value = {
            @Result(column = "pid", property = "pid"),
            @Result(column = "sarid", property = "sarid"),
            @Result(column = "pid", property = "project", one = @One(select = "com.lms.mims.mapper.ProjectMapper.selectById"))
            @Result(column = "sarid", property = "secareview", one = @One(select = "com.lms.mims.mapper.ProjectMapper.selectById"))
    })
    List<Selfexam> selectAll();

}
