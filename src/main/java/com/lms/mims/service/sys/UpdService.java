package com.lms.mims.service.sys;

import com.lms.mims.domain.DateResultSet;
import com.lms.mims.domain.sys.Upd;
import com.lms.mims.mapper.sys.UpdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UpdService {

    @Autowired
    private UpdMapper updMapper;

    /**
     * 查询所有
     * @return
     */
    public List<DateResultSet<Upd>> queryAll() {
        List<Upd> upds = this.updMapper.selectAll();
        // 对数据进行格式化
        DateResultSet<Upd> initUpd = new DateResultSet();
        List<DateResultSet<Upd>> initUpdList = new ArrayList<>();
        List<Upd> results = new ArrayList<>();
        // 初始化数据
        Timestamp ts = upds.get(0).getUpddate();
        initUpd.setDate(ts);
        results.add(upds.get(0));
        for (int i = 1; i < upds.size(); i++) {
            // Timestamp判断相等需用equals
            if (ts.equals(upds.get(i).getUpddate())) {
                results.add(upds.get(i));
            } else {
                initUpd.setResults(results);
                initUpdList.add(initUpd);
                ts = upds.get(i).getUpddate();
                results = new ArrayList<>();
                initUpd = new DateResultSet();
                initUpd.setDate(ts);
                results.add(upds.get(i));
            }
        }
        initUpd.setResults(results);
        initUpdList.add(initUpd);
        return initUpdList;
    }

    /**
     * 获取最新的数据
     * @return
     */
    public Upd queryMaxId() {
        return this.updMapper.selectMaxId();
    }

    /**
     * 新增
     * @param upd
     * @return
     */
    public Integer add(Upd upd) {
        // 赋值当前时间戳
        upd.setUpddate(new Timestamp(new Date().getTime()));
        return this.updMapper.add(upd);
    }
}
