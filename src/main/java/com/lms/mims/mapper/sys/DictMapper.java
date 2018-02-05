package com.lms.mims.mapper.sys;

import com.lms.mims.domain.sys.Dict;
import com.lms.mims.domain.work.Review;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:32
 */
public interface DictMapper extends Mapper<Dict> {

}
