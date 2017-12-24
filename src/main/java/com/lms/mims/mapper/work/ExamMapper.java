package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Exam;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 查验mapper
 */
public interface ExamMapper {

    @Select("select * from exam")
    @Results(value = {
            @Result(column = "sfeid", property = "sfeid"),
            @Result(column = "rewid", property = "rewid"),
            @Result(column = "sfeid", property = "selfexam", one = @One(select = "com.lms.mims.mapper.work.SelfexamMapper.selectById")),
            @Result(column = "rewid", property = "review", one = @One(select = "com.lms.mims.mapper.work.ReviewMapper.selectById"))
    })
    List<Exam> selectAll();

    @Select("select * from exam where eid = #{eid}")
    @Results(value = {
            @Result(column = "sfeid", property = "sfeid"),
            @Result(column = "rewid", property = "rewid"),
            @Result(column = "sfeid", property = "selfexam", one = @One(select = "com.lms.mims.mapper.work.SelfexamMapper.selectById")),
            @Result(column = "rewid", property = "review", one = @One(select = "com.lms.mims.mapper.work.ReviewMapper.selectById"))
    })
    Exam selectById(@Param("eid") int eid);

    @Select("select * from exam where sfeid = #{sfeid}")
    @Results(value = {
            @Result(column = "sfeid", property = "sfeid"),
            @Result(column = "rewid", property = "rewid"),
            @Result(column = "sfeid", property = "selfexam", one = @One(select = "com.lms.mims.mapper.work.SelfexamMapper.selectById")),
            @Result(column = "rewid", property = "review", one = @One(select = "com.lms.mims.mapper.work.ReviewMapper.selectById"))
    })
    List<Exam> selectBySfeid(@Param("sfeid") int sfeid);

    @UpdateProvider(type = SqlProviderDao.class, method = "upd")
    Integer updById(Exam exam);

    class SqlProviderDao {
        public String upd(Exam exam) {
            String sql = "update exam set ";
            if (exam.getLv() != null) {
                sql += "lv = '" + exam.getLv() + "', ";
            }
            if (exam.getRemark() != null) {
                sql += "remark = '" + exam.getRemark() + "', ";
            }
            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where eid = " + exam.getEid();
            return sql;
        }
    }


}
