package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Dict;
import com.lms.mims.domain.work.Review;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:32
 */
public interface DictMapper {

    @Select("select * from dict")
    List<Dict> selectAll();

    @Select("select * from dict where navid = #{navid}")
    List<Dict> selectByNavid(@Param("navid") int navid);

    @Select("select * from dict where id = #{id}")
    Dict selectById(@Param("id") int id);

    @InsertProvider(type = DictProviderDao.class, method = "add")
    Integer add(Dict dict);

    @UpdateProvider(type = DictProviderDao.class, method = "upd")
    Integer upd(Dict dict);

    /**
     * @description 格式化sql
     * @author louiemain
     * @date Created on 2018/1/11 18:35
     * @param
     * @return
     */
    class DictProviderDao {

        /**
         * @description 新增
         * @author louiemain
         * @date Created on 2018/1/11 18:34
         * @param dict
         * @return java.lang.String
         */
        public String add(Dict dict) {
            String sql = "insert into dict (name, content, navid) values ('"
                    + dict.getName() + "', '"
                    + dict.getContent() + "', "
                    + dict.getNavid() + ")";
            return sql;
        }

        /**
         * @description 修改
         * @author louiemain
         * @date Created on 2018/1/11 18:34
         * @param dict
         * @return java.lang.String
         */
        public String upd(Dict dict) {
            String sql = "update dict set ", str = "";
            str = dict.getName();
            if (str != null) {
                sql += "name = '" + str + "', ";
            }
            str = dict.getContent();
            if (str != null) {
                sql += "content = '" + str + "', ";
            }

            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where id = " + dict.getId();
            return sql;
        }
    }

}
