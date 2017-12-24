package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Project;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目mapper
 */
public interface ProjectMapper {

    @Select("select * from project")
    List<Project> selectAll();

    @Select("select * from project where prjid = #{prjid}")
    Project selectById(@Param("prjid") int prjid);
}
