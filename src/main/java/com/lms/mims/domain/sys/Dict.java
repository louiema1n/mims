package com.lms.mims.domain.sys;

/**
 * @description 字典
 * @author&date Created by louiemain on 2018-01-10 16:31
 */
public class Dict {

    private int id;
    private String name;
    private String content;
    private int state;
    private int navid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNavid() {
        return navid;
    }

    public void setNavid(int navid) {
        this.navid = navid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
