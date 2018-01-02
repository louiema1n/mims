package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Item;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * 临时项目mapper
 */
public interface ItemMapper {

    @Select("select * from item")
    List<Item> selectAll();

    @Select("select * from item where (ed is null and str <= #{today}) or ed = #{today}")
    List<Item> selectToday(@Param("today") String today);

    @InsertProvider(type = ItemProviderDao.class, method = "add")
    Integer add(Item item);

    @UpdateProvider(type = ItemProviderDao.class, method = "upd")
    Integer upd(Item item);

    @DeleteProvider(type = ItemProviderDao.class, method = "del")
    Integer del(Item item);


    class ItemProviderDao {

        /**
         * @description 新增
         * @author louiemain
         * @date Created on 2017-12-29 11:17
         * @param item
         * @return java.lang.String
         */
        public String add(Item item) {
            String sql = "insert into item (itemname, leader, assistant, str, pre, type, prjid) values ('"
                    + item.getItemname() + "', '"
                    + item.getLeader() + "', '"
                    + item.getAssistant() + "', '"
                    + item.getStr() + "', '"
                    + item.getPre() + "', "
                    + item.getType() + ", "
                    + (item.getPrjid() == 0 ? null : item.getPrjid()) + ")";
            return sql;
        }

        /**
         * @description 更新
         * @author louiemain
         * @date Created on 2017-12-29 11:22
         * @param item
         * @return java.lang.String
         */
        public String upd(Item item) {
            String sql = "update item set ", str = "";
            Timestamp ts = null;
            str = item.getItemname();
            if (str != null) {
                sql += "itemname = '" + str + "', ";
            }
            str = item.getLeader();
            if (str != null) {
                sql += "leader = '" + str + "', ";
            }
            str = item.getAssistant();
            if (str != null) {
                sql += "assistant = '" + str + "', ";
            }
            ts = item.getStr();
            if (ts != null) {
                sql += "str = '" + ts + "', ";
            }
            ts = item.getEd();
            if (ts != null) {
                sql += "ed = '" + ts + "', ";
            }
            ts = item.getPre();
            if (ts != null) {
                sql += "pre = '" + ts + "', ";
            }
            sql += "type = " + item.getType() + ", ";
            str = item.getRemark();
            if (str != null) {
                sql += "remark = '" + str + "', ";
            }
            if (item.getPrjid() != 0) {
                sql += "prjid = " + item.getPrjid() + ", ";
            }
            sql = sql.substring(0, sql.lastIndexOf(", "));
            sql += " where itemid = " + item.getItemid();
            return sql;
        }

        /**
         * @description 删除
         * @author louiemain
         * @date Created on 2017-12-29 16:24
         * @param item
         * @return java.lang.String
         */
        public String del(Item item) {
            return "delete from item where itemid = " + item.getItemid();
        }
    }
}

