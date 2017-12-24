package com.lms.mims.domain.work;

import java.sql.Timestamp;

/**
 * 临时项目实体
 */
public class Item {

    private int itemid;
    private String itemname;
    private String leader;
    private String assistant;
    private Timestamp str;
    private Timestamp ed;
    private Timestamp pre;
    private int state;
    private String remark;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
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

    public Timestamp getPre() {
        return pre;
    }

    public void setPre(Timestamp pre) {
        this.pre = pre;
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
