package com.lms.mims.domain;

import java.util.List;

/**
 * @description 分页结果集
 * @author&date Created by louiemain on 2018-01-29 14:16
 */
public class PageResult {

    private long total;
    private long pages;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }
}
