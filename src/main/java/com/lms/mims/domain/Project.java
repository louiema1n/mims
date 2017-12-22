package com.lms.mims.domain;

/**
 * 项目实体
 */
public class Project {

    private int prjid;
    private String prjname;
    private String leader;
    private String contacts;

    public int getPrjid() {
        return prjid;
    }

    public void setPrjid(int prjid) {
        this.prjid = prjid;
    }

    public String getPrjname() {
        return prjname;
    }

    public void setPrjname(String prjname) {
        this.prjname = prjname;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
