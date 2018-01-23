package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.BLCJExam;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-23 9:40
 */
public interface BLCJExamMapper {

    @Select("select * from blcjexam where id = #{id}")
    @Results(value = {
            @Result(column = "rid", property = "rid"),
            @Result(column = "rid", property = "radio", one = @One(select = "com.lms.mims.mapper.study.RadioMapper.selectById"))
        }
    )
    BLCJExam selectById(int id);
}
