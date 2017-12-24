package com.lms.mims.service.work;

import com.lms.mims.domain.work.Exam;
import com.lms.mims.mapper.work.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamMapper examMapper;

    /**
     * 查询所有exam
     * @return
     */
    public List<Exam> queryAll() {
        return this.examMapper.selectAll();
    }

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    public Exam queryById(int sid) {
        return this.examMapper.selectById(sid);
    }

    /**
     * 根据sfeid查询
     * @param sfeid
     * @return
     */
    public List<Exam> queryBySfeid(int sfeid) {
        return this.examMapper.selectBySfeid(sfeid);
    }

    /**
     * 更新
     * @param exam
     * @return
     */
    public Integer updByExam(Exam exam) {
        return this.examMapper.updById(exam);
    }
}
