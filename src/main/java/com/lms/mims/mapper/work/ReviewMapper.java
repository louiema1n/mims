package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Review;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 二甲评审mapper
 */
public interface ReviewMapper {

    @Select("select * from review")
    @Results(value = {
            @Result(column = "stdid", property = "stdid"),
            @Result(column = "stdid", property = "standard", one = @One(select = "com.lms.mims.mapper.work.StandardMapper.selectById"))
    })
    List<Review> selectAll();

    @Select("select * from review where rid = #{rid}")
    Review selectById(@Param("rid") int rid);

}
