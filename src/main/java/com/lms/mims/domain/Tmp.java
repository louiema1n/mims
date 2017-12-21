package com.lms.mims.domain;

import java.sql.Timestamp;

/**
 * 临时项目实体
 */
public class Tmp {

    private int tid;
    private String tname;
    private String leader;
    private String assistant;
    private Timestamp str;
    private Timestamp ed;
    private String remark;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public Timestamp getStr() {
        return str;
    }

    public void setStr(Timestamp str) {
        this.str = str;
    }

    public Timestamp getEd() {
        return ed;
    }

    public void setEd(Timestamp ed) {
        this.ed = ed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
