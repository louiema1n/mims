package com.lms.mims.domain.sys;

import java.sql.Timestamp;
import java.util.List;

/**
 * 对更新日志数据进行格式化
 */
public class InitUpd {

    private Timestamp upddate;
    private List<Upd> results;

    public Timestamp getUpddate() {
        return upddate;
    }

    public void setUpddate(Timestamp upddate) {
        this.upddate = upddate;
    }

    public List<Upd> getResults() {
        return results;
    }

    public void setResults(List<Upd> results) {
        this.results = results;
    }
}
