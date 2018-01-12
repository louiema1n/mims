package com.lms.mims.domain.study.syllabus;

import java.sql.Timestamp;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:34
 */
public class Syllabus {

    private int id;
    private String name;
    private String content;
    private String creator;
    private Timestamp creatdate;
    private int req;
    private String subject;
    private String chapter;
    private String unit;

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Timestamp creatdate) {
        this.creatdate = creatdate;
    }

    public int getReq() {
        return req;
    }

    public void setReq(int req) {
        this.req = req;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
