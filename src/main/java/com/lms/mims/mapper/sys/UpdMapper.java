package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Upd;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 更新日志mapper
 */
public interface UpdMapper {

    @Select("select * from upd order by updid desc")
    List<Upd> selectAll();

    @Select("select * from upd where updid = #{updid}")
    Update selectById(@Param("updid") int updid);

    @UpdateProvider(type = UpdProviderDao.class, method = "add")
    Integer add(Upd upd);

    @Select("SELECT * from upd WHERE updid = (select max(updid) from upd)")
    Upd selectMaxId();

    /**
     * 格式化sql
     */
    class UpdProviderDao {

        /**
         * 新增
         * @param upd
         * @return
         */
        public String add(Upd upd) {
            String sql = "insert into upd (updname, upddate, solution, type, ver) values ('"
                    + upd.getUpdname() + "', '"
                    + upd.getUpddate() + "', '"
                    + upd.getSolution() + "', "
                    + upd.getType() + ", '"
                    + upd.getVer() + "')";
            return sql;
        }
    }


}
