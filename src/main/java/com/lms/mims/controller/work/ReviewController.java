package com.lms.mims.controller.work;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.work.Review;
import com.lms.mims.service.work.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Secareview控制器
 */
@RestController
@RequestMapping("/rew")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    /**
     * 获取所有review
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Review> getAll() {
        ResultSet<Review> sarResultSet = new ResultSet<>();
        sarResultSet.setCode(0);
        sarResultSet.setMsg("查询成功");
        sarResultSet.setCount(this.reviewService.queryAll().size());
        sarResultSet.setData(this.reviewService.queryAll());
        return sarResultSet;
    }
}
