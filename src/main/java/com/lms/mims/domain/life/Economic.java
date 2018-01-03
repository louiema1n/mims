package com.lms.mims.domain.life;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @description 经济管理实体
 * @author&date Created by louiemain on 2018-01-03 10:02
 */
public class Economic {

    private int ecoid;
    private String category;
    private BigDecimal money;
    private Timestamp ecoTime;
    private String ecoName;
    private String remark;
    private int state;

    public int getEcoid() {
        return ecoid;
    }

    public void setEcoid(int ecoid) {
        this.ecoid = ecoid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Timestamp getEcoTime() {
        return ecoTime;
    }

    public void setEcoTime(Timestamp ecoTime) {
        this.ecoTime = ecoTime;
    }

    public String getEcoName() {
        return ecoName;
    }

    public void setEcoName(String ecoName) {
        this.ecoName = ecoName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
