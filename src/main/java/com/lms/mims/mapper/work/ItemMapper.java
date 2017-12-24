package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 临时项目mapper
 */
public interface ItemMapper {

    @Select("select * from item")
    List<Item> selectAll();
}
