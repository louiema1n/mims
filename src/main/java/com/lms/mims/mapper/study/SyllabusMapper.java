package com.lms.mims.mapper.study;

import com.lms.mims.domain.study.syllabus.Syllabus;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.sql.Timestamp;
import java.util.List;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:38
 */
public interface SyllabusMapper {

    @Select("select * from syllabus")
    List<Syllabus> selectAll();

    @InsertProvider(type = SybProviderDao.class, method = "add")
    Integer add(Syllabus syllabus);

    @UpdateProvider(type = SybProviderDao.class, method = "upd")
    Integer upd(Syllabus syllabus);

    @DeleteProvider(type = SybProviderDao.class, method = "del")
    Integer del(Syllabus syllabus);

    class SybProviderDao {
        /**
         * 新增
         * @param syllabus
         * @return
         */
        public String add(Syllabus syllabus) {
            String sql = "insert into syllabus (name, content, creator, creatdate, req, subject, chapter, unit) values ('"
                    + syllabus.getName() + "', '"
                    + syllabus.getContent() + "', '"
                    + syllabus.getCreator() + "', '"
                    + syllabus.getCreatdate() + "', "
                    + syllabus.getReq() + ", '"
                    + syllabus.getSubject() + "', '"
                    + syllabus.getChapter() + "', '"
                    + syllabus.getUnit() + "')";
            return sql;
        }

        /**
         * 更新
         * @param syllabus
         * @return
         */
        public String upd(Syllabus syllabus) {
            String sql = "update syllabus set ", str = "";
            Timestamp ts = null;
            str = syllabus.getName();
            if (str != null) {
                sql += "name = '" + str + "', ";
            }
            str = syllabus.getContent();
            if (str != null) {
                sql += "content = '" + str + "', ";
            }
            str = syllabus.getCreator();
            if (str != null) {
                sql += "creator = '" + str + "', ";
            }
            ts = syllabus.getCreatdate();
            if (str != null) {
                sql += "creatdate = '" + ts + "', ";
            }
            sql += "req = " + syllabus.getReq() + ", ";
            str = syllabus.getSubject();
            if (str != null) {
                sql += "subject = '" + str + "', ";
            }
            str = syllabus.getChapter();
            if (str != null) {
                sql += "chapter = '" + str + "', ";
            }
            str = syllabus.getUnit();
            if (str != null) {
                sql += "unit = '" + str + "', ";
            }

            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where id = " + syllabus.getId();
            return sql;
        }

        /**
         * @description 删除
         * @author louiemain
         * @date Created on 2018/1/14 12:09
         * @param syllabus
         * @return java.lang.String
         */
        public String del(Syllabus syllabus) {
            return "delete from syllabus where id = " + syllabus.getId();
        }
    }
}
