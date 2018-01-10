package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Nav;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 系统导航
 */
public interface NavMapper {

    @Select("select * from sysnav")
    List<Nav> selectAll();

    @Select("select * from sysnav where uplevel != 0")
    @Results(value = {
            @Result(column = "id", property = "dicts", one = @One(select = "com.lms.mims.mapper.sys.DictMapper.selectByNavid")),
    })
    List<Nav> select2Nav();

    @Select("select * from nav where navid = #{navid}")
    Nav selectById(@Param("navid") int navid);

    @UpdateProvider(type = NavProviderDao.class, method = "add")
    Integer add(Nav nav);

    /**
     * 格式化sql
     */
    class NavProviderDao {

        /**
         * 新增
         * @param nav
         * @return
         */
        public String add(Nav nav) {
            String sql = "insert into nav (navname, icon, url, uplevel) values ('"
                    + nav.getName() + "', '"
                    + nav.getIcon() + "', '"
                    + nav.getUrl() + "', "
                    + nav.getUplevel() + "')";
            return sql;
        }
    }


}
