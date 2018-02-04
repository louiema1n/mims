package com.lms.mims.controller.work;

import com.lms.mims.domain.LayuiResult;
import com.lms.mims.domain.work.Selfexam;
import com.lms.mims.service.work.SelfexamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Selfexam控制器
 */
@RestController
@RequestMapping("/sfe")
public class SelfexamController {

    @Autowired
    private SelfexamService selfexamService;

    /**
     * 获取所有Selfexam
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public LayuiResult<Selfexam> getAll() {
        LayuiResult<Selfexam> selfexamResultSet = new LayuiResult<>();

        List<Selfexam> selfexams = this.selfexamService.queryAll();

        selfexamResultSet.setCode(0);
        selfexamResultSet.setMsg("查询成功");
        selfexamResultSet.setCount(selfexams.size());
        selfexamResultSet.setData(selfexams);
        return selfexamResultSet;
    }

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    @RequestMapping(value = "/get/{sid}", method = RequestMethod.GET)
    public Selfexam getById(@PathVariable int sid) {
        return this.selfexamService.queryById(sid);
    }

    /**
     * 新增
     * @param selfexam
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Selfexam selfexam) {
        this.selfexamService.add(selfexam);
        return "保存成功。";
    }

    /**
     * 根据id删除
     * @param sid
     * @return
     */
    @RequestMapping(value = "/del/{sid}", method = RequestMethod.DELETE)
    public String delById(@PathVariable int sid) {
        this.selfexamService.delById(sid);
        return "删除成功！";
    }
}
