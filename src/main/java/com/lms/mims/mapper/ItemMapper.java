package com.lms.mims.mapper;

import com.lms.mims.domain.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 临时项目mapper
 */
public interface ItemMapper {

    @Select("select * from item")
    List<Item> selectAll();
}
