package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.Ansrecord;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * @description 答题记录
 * @author&date Created by louiemain on 2018/1/12 19:38
 */
public interface AnsrecodMapper {

    @Select("select * from ansrecord")
    List<Ansrecord> selectAll();

    @Select("select * from ansrecord where ansid = #{ansid}")
    @Results(value = {
            @Result(column = "examid", property = "examid"),
            @Result(column = "examid", property = "blcjExam", one = @One(select = "com.lms.mims.mapper.study.BLCJExamMapper.selectById"))
    }
    )
    List<Ansrecord> selectByAnsid(@Param("ansid") String ansid);

    @Select("select * from ansrecord where examid = #{examid} and anser = #{anser}")
    List<Ansrecord> selectByExamidAndAnser(@Param("examid") int examid, @Param("anser") String anser);

    @Select("select * from ansrecord where examid = #{examid} and anser = #{anser} and flag =#{flag}")
    Ansrecord selectByExamidAndFlag(@Param("examid") int examid, @Param("anser") String anser, @Param("flag") int flag);

    @InsertProvider(type = AnsrecordProviderDao.class, method = "add")
    Integer add(Ansrecord ansrecord);

    @Update("update ansrecord set remark = #{remark} where examid= #{examid} and flag = #{flag} and anser = #{anser}")
    Integer updByExamidAndFlagAndAnser(@Param("examid") int examid,
                                       @Param("flag") int flag,
                                       @Param("anser") String anser,
                                       @Param("remark") String remark);

    @Update("update ansrecord set remark = #{remark} where examid= #{examid} and flag = #{flag} and anser = #{anser} and ansid = #{ansid}")
    Integer updByExamidAndFlagAndAnserAndAnsid(@Param("examid") int examid,
                                       @Param("flag") int flag,
                                       @Param("anser") String anser,
                                       @Param("ansid") String ansid,
                                       @Param("remark") String remark);

    class AnsrecordProviderDao {

        /**
         * @description 新增
         * @author louiemain
         * @date Created on 2018-01-26 16:01
         * @param ansrecord
         * @return java.lang.String
         */
        public String add(Ansrecord ansrecord) {
            String sql = "insert into ansrecord (examid, selectans, sign, anstime, anser, ansid, remark, flag) values ("
                    + ansrecord.getExamid() + ", '"
                    + ansrecord.getSelectans() + "', "
                    + ansrecord.getSign() + ", '"
                    + ansrecord.getAnstime() + "', '"
                    + ansrecord.getAnser() + "', '"
                    + ansrecord.getAnsid() + "', '"
                    + ansrecord.getRemark() + "', "
                    + ansrecord.getFlag() + ")";
            return sql;
        }

        /**
         * @description 更新
         * @author louiemain
         * @date Created on 2018-02-01 10:10
         * @param ansrecord
         * @return java.lang.String
         */
        public String upd(Ansrecord ansrecord) {
            String sql = "update ansrecord set ", str = "";
            Timestamp ts = null;
            sql += "examid = " + ansrecord.getExamid() + ", ";
            str = ansrecord.getSelectans();
            if (str != null) {
                sql += "selectans = '" + str + "', ";
            }
            sql += "sign = " + ansrecord.getSign() + ", ";
            ts = ansrecord.getAnstime();
            if (str != null) {
                sql += "anstime = '" + ts + "', ";
            }
            str = ansrecord.getAnser();
            if (str != null) {
                sql += "anser = '" + str + "', ";
            }
            str = ansrecord.getAnsid();
            if (str != null) {
                sql += "ansid = '" + ts + "', ";
            }
            str = ansrecord.getRemark();
            if (str != null) {
                sql += "remark = '" + str + "', ";
            }
            sql += "flag = " + ansrecord.getFlag() + ", ";
            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where id = " + ansrecord.getId();
            return sql;
        }

    }
}
