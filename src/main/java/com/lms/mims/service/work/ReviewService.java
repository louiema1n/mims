package com.lms.mims.service.work;

import com.lms.mims.domain.work.Review;
import com.lms.mims.mapper.work.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    /**
     * 查询所有review
     * @return
     */
    public List<Review> queryAll() {
        return this.reviewMapper.selectAll();
    }

    /**
     * 根据条件查询
     * @param stdid
     * @return
     */
    public List<Review> queryByStdid(int stdid) {
        return this.reviewMapper.selectByStdid(stdid);
    }

    /**
     * 新增
     * @param review
     * @return
     */
    public Integer add(Review review) {
        return this.reviewMapper.add(review);
    }

    /**
     * 根据id删除
     * @param rid
     * @return
     */
    public Integer delById(int rid) {
        return this.reviewMapper.delById(rid);
    }
}
