package com.lms.mims.mapper.life;

import com.lms.mims.domain.life.Economic;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * @description 经济管理
 * @author louiemain
 * @date Created on 2018-01-03 10:07
 * @param
 * @return
 */
public interface EconomicMapper {

    @Select("select * from economic")
    List<Economic> selectAll();

    @Select("select * from economic where ecoid = #{ecoid}")
    Economic selectById(@Param("ecoid") int ecoid);

    @InsertProvider(type = EcoProviderDao.class, method = "add")
    Integer add(Economic economic);

    @Delete("delete from economic where ecoid = #{ecoid}")
    Integer delById(@Param("ecoid") int ecoid);

    @UpdateProvider(type = EcoProviderDao.class, method = "upd")
    Integer upd(Economic economic);


    class EcoProviderDao {
        /**
         * 新增
         * @param economic
         * @return
         */
        public String add(Economic economic) {
            String sql = "INSERT INTO economic (category, money, ecoTime, ecoName, remark, state) VALUES ('"
                    + economic.getCategory() + "', '"
                    + economic.getMoney() + "', '"
                    + economic.getEcoTime() + "', '"
                    + economic.getEcoName() + "', '"
                    + economic.getRemark() + "', "
                    + economic.getState() + ")";
            return sql;
        }

        /**
         * 更新
         * @param economic
         * @return
         */
        public String upd(Economic economic) {
            String sql = "update economic set ", str = "";
            BigDecimal bd;
            Timestamp ts;
            str = economic.getCategory();
            if (str != null) {
                sql += "category = '" + str + "', ";
            }
            bd = economic.getMoney();
            if (bd != null) {
                sql += "money = '" + bd + "', ";
            }
            ts = economic.getEcoTime();
            if (ts != null) {
                sql += "ecoTime = '" + ts + "', ";
            }
            str = economic.getEcoName();
            if (str != null) {
                sql += "ecoName = '" + str + "', ";
            }
            str = economic.getRemark();
            if (str != null) {
                sql += "remark = '" + str + "', ";
            }
            sql += "state = " + economic.getState() + ", ";

            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where ecoid = " + economic.getEcoid();
            return sql;
        }
    }
}
