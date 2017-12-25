package com.lms.mims.service.work;

import com.lms.mims.domain.work.Exam;
import com.lms.mims.domain.work.Review;
import com.lms.mims.domain.work.Selfexam;
import com.lms.mims.mapper.work.SelfexamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class SelfexamService {

    @Autowired
    private SelfexamMapper selfexamMapper;

    @Autowired
    private ExamService examService;

    @Autowired
    private ReviewService reviewService;

    /**
     * 查询所有Selfexam
     * @return
     */
    public List<Selfexam> queryAll() {
        return this.selfexamMapper.selectAll();
    }

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    public Selfexam queryById(int sid) {
        return this.selfexamMapper.selectById(sid);
    }

    /**
     * 更新
     * @param selfexam
     * @return
     */
    public Integer upd(Selfexam selfexam) {
        return this.selfexamMapper.upd(selfexam);
    }

    /**
     * 新增
     * @param selfexam
     * @return
     */
    public Integer add(Selfexam selfexam) {
        int i= 0 , j = 0;
        // 赋值当前时间戳
        selfexam.setSdate(new Timestamp(new Date().getTime()));
        // 新增
        i = this.selfexamMapper.add(selfexam);

        // 获取当前standard的所有review
        List<Review> reviews = this.reviewService.queryByStdid(selfexam.getStdid());
        // 遍历
        Exam exam = new Exam();
        exam.setSfeid(selfexam.getSid());
        for (Review review: reviews) {
            exam.setRewid(review.getRid());
            // 增加到exam
            j = this.examService.add(exam);
        }
        if (i > 0 && j > 0) {
            return 1;
        }
        return 0;
    }

    /**
     * 根据id删除
     * @param sid
     * @return
     */
    public Integer delById(int sid) {
        // 根据id删除表exam表相关记录
        int j = this.examService.delBySfeid(sid);
        // 同时根据id删除selfexam表
        int i = this.selfexamMapper.delById(sid);
        if (i > 0 && j > 0) {
            return 1;
        }
        return 0;
    }
}
