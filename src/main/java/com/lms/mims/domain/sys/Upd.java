package com.lms.mims.domain.sys;

import java.sql.Timestamp;

/**
 * 更新日志
 */
public class Upd {
    private int updid;
    private String updname;
    private String solution;
    private String type;
    private String ver;
    private Timestamp upddate;

    public int getUpdid() {
        return updid;
    }

    public void setUpdid(int updid) {
        this.updid = updid;
    }

    public String getUpdname() {
        return updname;
    }

    public void setUpdname(String updname) {
        this.updname = updname;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Timestamp getUpddate() {
        return upddate;
    }

    public void setUpddate(Timestamp upddate) {
        this.upddate = upddate;
    }
}
