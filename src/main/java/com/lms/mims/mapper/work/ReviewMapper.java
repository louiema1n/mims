package com.lms.mims.mapper.work;

import com.lms.mims.domain.work.Review;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReviewMapper {

    @Select("select * from review")
    @Results(value = {
            @Result(column = "stdid", property = "stdid"),
            @Result(column = "stdid", property = "standard", one = @One(select = "com.lms.mims.mapper.work.StandardMapper.selectById"))
    })
    List<Review> selectAll();

    @Select("select * from review where rid = #{rid}")
    Review selectById(@Param("rid") int rid);

    @Select("select * from review where stdid = #{stdid}")
    @Results(value = {
            @Result(column = "stdid", property = "stdid"),
            @Result(column = "stdid", property = "standard", one = @One(select = "com.lms.mims.mapper.work.StandardMapper.selectById"))
    })
    List<Review> selectByStdid(@Param("stdid") int stdid);

    @InsertProvider(type = RewProviderDao.class, method = "add")
    Integer add(Review review);

    @Delete("delete from review where rid = #{rid}")
    Integer delById(@Param("rid") int rid);


    class RewProviderDao {
        /**
         * 新增
         * @param review
         * @return
         */
        public String add(Review review) {
            String sql = "insert into review (rname, reviewstd, requiredA, requiredB, requiredC, state, eg, stdid) values ('"
                    + review.getRname() + "', '"
                    + review.getReviewstd() + "', '"
                    + review.getRequiredA() + "', '"
                    + review.getRequiredB() + "', '"
                    + review.getRequiredC() + "', "
                    + review.getState() + ", '"
                    + review.getEg() + "', "
                    + review.getStdid() + ")";
            return sql;
        }
    }
}
