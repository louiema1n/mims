package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.Ansrecord;
import org.apache.ibatis.annotations.*;

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

    @InsertProvider(type = AnsrecordProviderDao.class, method = "add")
    Integer add(Ansrecord ansrecord);

    class AnsrecordProviderDao {

        /**
         * @description 新增
         * @author louiemain
         * @date Created on 2018-01-26 16:01
         * @param ansrecord
         * @return java.lang.String
         */
        public String add(Ansrecord ansrecord) {
            String sql = "insert into ansrecord (examid, selectans, sign, anstime, anser, ansid, remark) values ("
                    + ansrecord.getExamid() + ", '"
                    + ansrecord.getSelectans() + "', "
                    + ansrecord.getSign() + ", '"
                    + ansrecord.getAnstime() + "', '"
                    + ansrecord.getAnser() + "', '"
                    + ansrecord.getAnsid() + "', '"
                    + ansrecord.getRemark() + "')";
            return sql;
        }


    }
}
