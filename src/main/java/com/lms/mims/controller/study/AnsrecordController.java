package com.lms.mims.controller.study;

import com.lms.mims.domain.study.syllabus.Ansrecord;
import com.lms.mims.service.study.AnsrecordService;
import com.lms.mims.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-26 16:07
 */
@RestController
@RequestMapping("/ansr")
public class AnsrecordController {

    @Autowired
    private AnsrecordService ansrecordService;

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-26 16:09
     * @param ansrecord
     * @return java.lang.String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request, Ansrecord ansrecord) {
        String ipAddr = IpUtil.getIpAddr(request);
        ansrecord.setAnser(ipAddr);
        ansrecord.setAnstime(new Timestamp(new Date().getTime()));
        int i = this.ansrecordService.add(ansrecord);
        if (i > 0) {
            return "新增成功";
        }
        return "新增失败";
    }

    /**
     * @description 获取准确率
     * @author louiemain
     * @date Created on 2018-01-26 16:49
     * @param examid
     * @param request
     * @return java.lang.String
     */
    @RequestMapping(value = "/getAccuracy/{examid}", method = RequestMethod.GET)
    public String getByExamidAndAnser(@PathVariable("examid") int examid, HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        int accuracy = 0;
        List<Ansrecord> ansrecords = this.ansrecordService.getByExamidAndAnser(examid, ipAddr);
        for (Ansrecord ansrecord : ansrecords) {
            if (ansrecord.getSign() == 1) {
                accuracy++;
            }
        }
        String result = "{\"accuracy\":\"" + accuracy + " / " + ansrecords.size() + "\"}";
        return result;
    }

    /**
     * @description 根据examid、flag查询
     * @author louiemain
     * @date Created on 2018-01-29 17:10
     * @param examid
     * @param flag
     * @param request
     * @return com.lms.mims.domain.study.syllabus.Ansrecord
     */
    @RequestMapping("/get/{examid}/{flag}")
    public Ansrecord getByExamidAndFlag(@PathVariable("examid") int examid, @PathVariable("flag") int flag, HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        return this.ansrecordService.getByExamidAndFlag(examid, ipAddr, flag);
    }
}
