package com.lms.mims.controller.work;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.work.Item;
import com.lms.mims.service.work.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * tmpitem控制器
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 获取所有tmpitem
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Item> getAll() {
        ResultSet<Item> tmpResultSet = new ResultSet<>();
        tmpResultSet.setCode(0);
        tmpResultSet.setMsg("查询成功");
        tmpResultSet.setCount(this.itemService.queryAll().size());
        tmpResultSet.setData(this.itemService.queryAll());
        return tmpResultSet;
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
