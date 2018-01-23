package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.Radio;
import org.apache.ibatis.annotations.Select;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-23 9:46
 */
public interface RadioMapper {

    @Select("select * from radio where id = #{id}")
    Radio selectById(int id);
}
