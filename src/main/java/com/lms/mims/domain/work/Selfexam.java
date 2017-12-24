package com.lms.mims.domain.work;

import java.sql.Timestamp;

/**
 * 自查实体
 */
public class Selfexam {

    private int sid;
    private String sname;
    private Timestamp sdate;
    private int pid;
    private int stdid;
    private String result;
    private String remark;

    private Project project;
    private Standard standard;

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

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
