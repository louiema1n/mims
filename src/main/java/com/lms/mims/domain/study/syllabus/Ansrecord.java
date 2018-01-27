package com.lms.mims.domain.study.syllabus;

import java.sql.Timestamp;

/**
 * @description 答题记录
 * @author&date Created by louiemain on 2018-01-26 15:56
 */
public class Ansrecord {

    private int id;
    private int examid;
    private String selectans;
    private int sign;
    private Timestamp anstime;
    private String anser;
    private String ansid;
    private String remark;
    private BLCJExam blcjExam;

    public void setBlcjExam(BLCJExam blcjExam) {
        this.blcjExam = blcjExam;
    }

    public BLCJExam getBlcjExam() {
        return blcjExam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExamid() {
        return examid;
    }

    public void setExamid(int examid) {
        this.examid = examid;
    }

    public String getSelectans() {
        return selectans;
    }

    public void setSelectans(String selectans) {
        this.selectans = selectans;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public Timestamp getAnstime() {
        return anstime;
    }

    public void setAnstime(Timestamp anstime) {
        this.anstime = anstime;
    }

    public String getAnser() {
        return anser;
    }

    public void setAnser(String anser) {
        this.anser = anser;
    }

    public String getAnsid() {
        return ansid;
    }

    public void setAnsid(String ansid) {
        this.ansid = ansid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
