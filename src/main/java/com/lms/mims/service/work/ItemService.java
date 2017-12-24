package com.lms.mims.service.work;

import com.lms.mims.domain.work.Item;
import com.lms.mims.mapper.work.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemMapper tmpMapper;

    /**
     * 查询所有tmpitem
     * @return
     */
    public List<Item> queryAll() {
        return this.tmpMapper.selectAll();
    }
}
