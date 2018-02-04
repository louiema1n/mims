package com.lms.mims.controller.work;

import com.lms.mims.domain.LayuiResult;
import com.lms.mims.domain.work.Exam;
import com.lms.mims.service.work.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * exam控制器
 */
@RestController
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    /**
     * 获取所有exam
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public LayuiResult<Exam> getAll() {
        LayuiResult<Exam> examResultSet = new LayuiResult<>();

        List<Exam> exams = this.examService.queryAll();

        examResultSet.setCode(0);
        examResultSet.setMsg("查询成功");
        examResultSet.setCount(exams.size());
        examResultSet.setData(exams);
        return examResultSet;
    }

    @RequestMapping(value = "/get/{sid}", method = RequestMethod.GET)
    public Exam getById(@PathVariable int sid) {
        return this.examService.queryById(sid);
    }

    /**
     * 根据sfeid查询exam
     * @param sfeid
     * @return
     */
    @RequestMapping(value = "/all/{sfeid}", method = RequestMethod.GET)
    public List<Exam> getBySfeid(@PathVariable int sfeid) {
        return this.examService.queryBySfeid(sfeid);
    }

    /**
     * 更新
     * @param exam
     * @return
     */
    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    public String updByExam(Exam exam) {
        this.examService.updByExam(exam);
        return "保存成功。";
    }

}
