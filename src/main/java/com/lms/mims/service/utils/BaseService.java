package com.lms.mims.service.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lms.mims.domain.LayuiResult;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description 通用service abstract必须继承
 * @author&date Created by louiemain on 2018/2/4 13:18
 */
public abstract class BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    /**
     * @description 查询所有 - 分页查询所有
     * @author louiemain
     * @date Created on 2018/2/4 13:23
     * @param
     * @return java.util.List<T>
     */
    public LayuiResult<T> queryAll(int page, int limit) {
        LayuiResult<T> layuiResult = new LayuiResult<>();
        // 分页查询
        Page<Object> pages = PageHelper.startPage(page, limit, true);
        // 查询所有
        List<T> ts = this.mapper.selectAll();
        if (ts.size() > 0) {
            // 成功
            layuiResult.setCode(0);
            layuiResult.setMsg("查询成功");
            layuiResult.setCount((int) pages.getTotal());
            layuiResult.setData(ts);
        } else {
            layuiResult.setCode(1);
            layuiResult.setMsg("查询失败");
            layuiResult.setCount(0);
            layuiResult.setData(null);
        }
        return layuiResult;
    }

    /**
     * @description 查询所有-不分页
     * @author louiemain
     * @date Created on 2018-02-05 14:54
     * @param
     * @return com.lms.mims.domain.LayuiResult<T>
     */
    public List<T> queryAll() {
        return this.mapper.selectAll();
    }

    /**
     * @description 根据id查询
     * @author louiemain
     * @date Created on 2018-02-05 14:31
     * @param id
     * @return T
     */
    public T queryById(int id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    /**
     * @description 根据实体属性查询
     * @author louiemain
     * @date Created on 2018-02-05 14:36
     * @param entity
     * @return java.util.List<T>
     */
    public List<T> query(T entity) {
        return this.mapper.select(entity);
    }

    /**
     * @description 新增-null字段不会保存，使用数据库默认值
     * @author louiemain
     * @date Created on 2018/2/4 14:17
     * @param entity
     * @return java.lang.String
     */
    public String add(T entity) {
        int i = this.mapper.insertSelective(entity);
        if (i > 0) {
            return "新增成功";
        }
        return "新增失败";
    }

    /**
     * @description 更新-null字段不会保存，使用数据库默认值
     * @author louiemain
     * @date Created on 2018/2/4 15:16
     * @param entity
     * @return java.lang.String
     */
    public String updById(T entity) {
        int i = this.mapper.updateByPrimaryKeySelective(entity);
        if (i > 0) {
            return "更新成功";
        }
        return "更新失败";
    }

    /**
     * @description 删除-根据主键
     * @author louiemain
     * @date Created on 2018/2/4 15:19
     * @param entity
     * @return java.lang.String
     */
    public String delById(T entity) {
        int i = this.mapper.deleteByPrimaryKey(entity);
        if (i > 0) {
            return "删除成功";
        }
        return "删除失败";
    }
}
