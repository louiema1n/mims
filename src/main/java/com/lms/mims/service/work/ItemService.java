package com.lms.mims.service.work;

import com.lms.mims.domain.work.Item;
import com.lms.mims.mapper.work.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询今天所有item
     * @return
     */
    public List<Item> queryToday() {
        return this.itemMapper.selectToday(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    /**
     * @description 查询所有item
     * @author louiemain
     * @date Created on 2018-01-02 11:03
     * @param
     * @return java.util.List<com.lms.mims.domain.work.Item>
     */
    public List<Item> queryAll() {
        return this.itemMapper.selectAll();
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2017-12-29 11:24
     * @param item
     * @return java.lang.Integer
     */
    public Integer add(Item item) {
        return this.itemMapper.add(item);
    }

    /**
     * @description 更新
     * @author louiemain
     * @date Created on 2017-12-29 11:25
     * @param item
     * @return java.lang.Integer
     */
    public Integer upd(Item item) {
        return this.itemMapper.upd(item);
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2017-12-29 16:25
     * @param item
     * @return java.lang.Integer
     */
    public Integer del(Item item) {
        return this.itemMapper.del(item);
    }
}
