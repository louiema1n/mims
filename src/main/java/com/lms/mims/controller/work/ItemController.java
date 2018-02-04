package com.lms.mims.controller.work;

import com.lms.mims.domain.LayuiResult;
import com.lms.mims.domain.work.Item;
import com.lms.mims.service.work.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * tmpitem控制器
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 获取所有item
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public LayuiResult<Item> getAll() {
        LayuiResult<Item> tmpResultSet = new LayuiResult<>();
        tmpResultSet.setCode(0);
        tmpResultSet.setMsg("查询成功");
        tmpResultSet.setCount(this.itemService.queryAll().size());
        tmpResultSet.setData(this.itemService.queryAll());
        return tmpResultSet;
    }

    /**
     * @description 获取当天所有item
     * @author louiemain
     * @date Created on 2018-01-02 11:05
     * @param
     * @return java.util.List<com.lms.mims.domain.DateResultSet<com.lms.mims.domain.work.Item>>
     */
    @RequestMapping(value = "/today", method = RequestMethod.GET)
    public List<Item> getAllAndInit() {
        return this.itemService.queryToday();
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2017-12-29 11:27
     * @param item
     * @return java.lang.String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Item item) {
        int i = this.itemService.add(item);
        if (i > 0) {
            return "新增成功！";
        }
        return "新增失败！";
    }

    /**
     * @description 修改
     * @author louiemain
     * @date Created on 2017-12-29 16:10
     * @param item
     * @return java.lang.String
     */
    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    public String upd(Item item) {
        int i = this.itemService.upd(item);
        if (i > 0) {
            return "修改成功！";
        }
        return "修改失败！";
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2017-12-29 16:27
     * @param itemid
     * @return java.lang.String
     */
    @RequestMapping(value = "/del/{itemid}", method = RequestMethod.DELETE)
    public String del(@PathVariable("itemid") int itemid) {
        Item item = new Item();
        item.setItemid(itemid);
        int i = this.itemService.del(item);
        if (i > 0) {
            return "删除成功！";
        }
        return "删除失败！";
    }
}
