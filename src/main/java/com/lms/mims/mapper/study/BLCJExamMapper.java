package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.BLCJExam;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    @Select("select * from blcjexam where catalog = #{catalog}")
    @Results(value = {
            @Result(column = "rid", property = "rid"),
            @Result(column = "rid", property = "radio", one = @One(select = "com.lms.mims.mapper.study.RadioMapper.selectById"))
    }
    )
    List<BLCJExam> selectByCatalog(@Param("catalog") String catalog);

    @Select("SELECT * FROM blcjexam AS t1 JOIN (SELECT ROUND(RAND() * ((SELECT MAX(id) FROM blcjexam)-(SELECT MIN(id) FROM blcjexam))+(SELECT MIN(id) FROM blcjexam)) AS id) AS t2 WHERE t1.id >= t2.id ORDER BY t1.id LIMIT 1")
    @Results(value = {
            @Result(column = "rid", property = "rid"),
            @Result(column = "rid", property = "radio", one = @One(select = "com.lms.mims.mapper.study.RadioMapper.selectById"))
    })
    BLCJExam selectRandOne();

    @Select("select * from blcjexam where name like concat('%',#{search},'%') or commons like concat('%',#{search},'%') or analysis like concat('%',#{search},'%')")
    @Results(value = {
            @Result(column = "rid", property = "rid"),
            @Result(column = "rid", property = "radio", one = @One(select = "com.lms.mims.mapper.study.RadioMapper.selectById"))
    })
    List<BLCJExam> selectBySearch(String search);
}
