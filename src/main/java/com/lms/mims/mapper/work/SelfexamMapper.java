package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Selfexam;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 自查mapper
 */
public interface SelfexamMapper {

    @Select("select * from selfexam")
    @Results(value = {
            @Result(column = "pid", property = "pid"),
            @Result(column = "stdid", property = "stdid"),
            @Result(column = "pid", property = "project", one = @One(select = "com.lms.mims.mapper.work.ProjectMapper.selectById")),
            @Result(column = "stdid", property = "standard", one = @One(select = "com.lms.mims.mapper.work.StandardMapper.selectById"))
    })
    List<Selfexam> selectAll();

    @Select("select * from selfexam where sid = #{sid}")
    @Results(value = {
            @Result(column = "pid", property = "pid"),
            @Result(column = "stdid", property = "stdid"),
            @Result(column = "pid", property = "project", one = @One(select = "com.lms.mims.mapper.work.ProjectMapper.selectById")),
            @Result(column = "stdid", property = "standard", one = @One(select = "com.lms.mims.mapper.work.StandardMapper.selectById"))
    })
    Selfexam selectById(@Param("sid") int sid);

    @UpdateProvider(type = SelfexamProviderDao.class, method = "upd")
    Integer upd(Selfexam selfexam);

    @UpdateProvider(type = SelfexamProviderDao.class, method = "add")
    @Options(useGeneratedKeys = true, keyProperty = "sid", keyColumn = "sid")   // 获取刚刚插入的自增id
    Integer add(Selfexam selfexam);

    @Delete("delete from selfexam where sid = #{sid}")
    Integer delById(@Param("sid") int sid);

    /**
     * 格式化sql
     */
    class SelfexamProviderDao {

        /**
         * 新增
         * @param selfexam
         * @return
         */
        public String add(Selfexam selfexam) {
            String sql = "insert into selfexam (sname, sdate, pid, stdid, result, remark) values ('"
                    + selfexam.getSname() + "', '"
                    + selfexam.getSdate() + "', "
                    + selfexam.getPid() + ", "
                    + selfexam.getStdid() + ", "
                    + selfexam.getResult() + ", "
                    + selfexam.getRemark() + ")";
            return sql;
        }

        /**
         * 更新
         * @param selfexam
         * @return
         */
        public String upd(Selfexam selfexam) {
            String sql = "update selfexam set ";
            if (selfexam.getSname() != null) {
                sql += "sname = '" + selfexam.getSname() + "', ";
            }
            if (selfexam.getSdate() != null) {
                sql += "sdate = '" + selfexam.getSdate() + "', ";
            }
            if (selfexam.getPid() != 0) {
                sql += "pid = '" + selfexam.getPid() + "', ";
            }
            if (selfexam.getStdid() != 0) {
                sql += "stdid = '" + selfexam.getStdid() + "', ";
            }
            if (selfexam.getResult() != null) {
                sql += "result = '" + selfexam.getResult() + "', ";
            }
            if (selfexam.getRemark() != null) {
                sql += "remark = '" + selfexam.getRemark() + "', ";
            }
            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where sid = " + selfexam.getSid();
            return sql;
        }
    }


}
