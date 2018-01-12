package com.lms.mims.domain.work;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-12 10:51
 */
public class Standard {
    private int stdid;
    private String stdname;
    private int state;
    private String remark;

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
