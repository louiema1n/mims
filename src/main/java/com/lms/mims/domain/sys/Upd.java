package com.lms.mims.domain.sys;

import java.util.Date;
import javax.persistence.*;

public class Upd {
    @Id
    private Integer updid;

    /**
     * 更新名称
     */
    private String updname;

    /**
     * 更新时间
     */
    private Date upddate;

    /**
     * 解决办法
     */
    private String solution;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 版本号
     */
    private String ver;

    /**
     * @return updid
     */
    public Integer getUpdid() {
        return updid;
    }

    /**
     * @param updid
     */
    public void setUpdid(Integer updid) {
        this.updid = updid;
    }

    /**
     * 获取更新名称
     *
     * @return updname - 更新名称
     */
    public String getUpdname() {
        return updname;
    }

    /**
     * 设置更新名称
     *
     * @param updname 更新名称
     */
    public void setUpdname(String updname) {
        this.updname = updname == null ? null : updname.trim();
    }

    /**
     * 获取更新时间
     *
     * @return upddate - 更新时间
     */
    public Date getUpddate() {
        return upddate;
    }

    /**
     * 设置更新时间
     *
     * @param upddate 更新时间
     */
    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    /**
     * 获取解决办法
     *
     * @return solution - 解决办法
     */
    public String getSolution() {
        return solution;
    }

    /**
     * 设置解决办法
     *
     * @param solution 解决办法
     */
    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取版本号
     *
     * @return ver - 版本号
     */
    public String getVer() {
        return ver;
    }

    /**
     * 设置版本号
     *
     * @param ver 版本号
     */
    public void setVer(String ver) {
        this.ver = ver == null ? null : ver.trim();
    }
}