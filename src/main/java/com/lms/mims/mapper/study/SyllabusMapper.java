package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.Syllabus;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:38
 */
public interface SyllabusMapper {

    @Select("select * from syllabus")
    List<Syllabus> selectAll();
}
