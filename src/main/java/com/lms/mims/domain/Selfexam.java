package com.lms.mims.domain;

import java.sql.Timestamp;
import java.util.List;

/**
 * 自查实体
 */
public class Selfexam {

    private int sid;
    private String sname;
    private Timestamp sdate;
    private int pid;
    private int sarid;
    private String lv;
    private String remark;

    private Project project;
    private Secareview secareview;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Timestamp getSdate() {
        return sdate;
    }

    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSarid() {
        return sarid;
    }

    public void setSarid(int sarid) {
        this.sarid = sarid;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Secareview getSecareview() {
        return secareview;
    }

    public void setSecareview(Secareview secareview) {
        this.secareview = secareview;
    }

}
