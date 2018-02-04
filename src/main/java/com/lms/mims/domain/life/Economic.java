package com.lms.mims.domain.life;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * @description 经济管理实体
 * @author louiemain
 * @date Created on 2018/2/4 13:21
 * @param
 * @return
 */
public class Economic {
    @Id
    private Integer ecoid;

    /**
     * 类别
     */
    private String category;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 时间
     * @DateTimeFormat String类型转换成Date
     */
    @Column(name = "ecoTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ecotime;

    /**
     * 出入人
     */
    @Column(name = "ecoName")
    private String econame;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态：0-支出；1-收入；2-预支出
     */
    private Byte state;

    /**
     * @return ecoid
     */
    public Integer getEcoid() {
        return ecoid;
    }

    /**
     * @param ecoid
     */
    public void setEcoid(Integer ecoid) {
        this.ecoid = ecoid;
    }

    /**
     * 获取类别
     *
     * @return category - 类别
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置类别
     *
     * @param category 类别
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取时间
     *
     * @return ecoTime - 时间
     */
    public Date getEcotime() {
        return ecotime;
    }

    /**
     * 设置时间
     *
     * @param ecotime 时间
     */
    public void setEcotime(Date ecotime) {
        this.ecotime = ecotime;
    }

    /**
     * 获取出入人
     *
     * @return ecoName - 出入人
     */
    public String getEconame() {
        return econame;
    }

    /**
     * 设置出入人
     *
     * @param econame 出入人
     */
    public void setEconame(String econame) {
        this.econame = econame == null ? null : econame.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取状态：0-支出；1-收入；2-预支出
     *
     * @return state - 状态：0-支出；1-收入；2-预支出
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态：0-支出；1-收入；2-预支出
     *
     * @param state 状态：0-支出；1-收入；2-预支出
     */
    public void setState(Byte state) {
        this.state = state;
    }
}