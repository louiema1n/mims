package com.lms.mims.domain.work;

/**
 * 查验实体
 */
public class Exam {

    private int eid;
    private int sfeid;
    private int rewid;
    private String lv;
    private String remark;

    private Selfexam selfexam;
    private Review review;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getSfeid() {
        return sfeid;
    }

    public void setSfeid(int sfeid) {
        this.sfeid = sfeid;
    }

    public int getRewid() {
        return rewid;
    }

    public void setRewid(int rewid) {
        this.rewid = rewid;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Selfexam getSelfexam() {
        return selfexam;
    }

    public void setSelfexam(Selfexam selfexam) {
        this.selfexam = selfexam;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
