package com.lms.mims.domain;

/**
 * 二甲评审实体
 */
public class Secareview {

    private int rid;
    private String rname;
    private String standard;
    private String requiredA;
    private String requiredB;
    private String requiredC;
    private int state;
    private String eg;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getRequiredA() {
        return requiredA;
    }

    public void setRequiredA(String requiredA) {
        this.requiredA = requiredA;
    }

    public String getRequiredB() {
        return requiredB;
    }

    public void setRequiredB(String requiredB) {
        this.requiredB = requiredB;
    }

    public String getRequiredC() {
        return requiredC;
    }

    public void setRequiredC(String requiredC) {
        this.requiredC = requiredC;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getEg() {
        return eg;
    }

    public void setEg(String eg) {
        this.eg = eg;
    }
}
