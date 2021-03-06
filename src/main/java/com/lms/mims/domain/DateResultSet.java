package com.lms.mims.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @description 日期格式结果集
 * @author&date Created by louiemain on 2018-01-02 8:54
 */
public class DateResultSet<T> {

    private Date date;
    private List<T> results;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
