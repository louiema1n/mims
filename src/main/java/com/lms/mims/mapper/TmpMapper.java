package com.lms.mims.mapper;

import com.lms.mims.domain.Tmp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 临时项目mapper
 */
public interface TmpMapper {

    @Select("select * from tmpitem")
    List<Tmp> selectAll();
}
