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
}
