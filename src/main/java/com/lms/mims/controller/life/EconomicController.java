package com.lms.mims.controller.life;

import com.lms.mims.domain.LayuiResult;
import com.lms.mims.domain.life.Economic;
import com.lms.mims.service.life.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

/**
 * @description 经济管理
 * @author&date Created by louiemain on 2018-01-03 10:27
 */
@RestController
@RequestMapping("/eco")
public class EconomicController {

    @Autowired
    private EconomicService economicService;

    /**
     * @description 查询所有-分页查询
     * @author louiemain
     * @date Created on 2018-01-03 11:19
     * @param
     * @return com.lms.mims.domain.ResultSet<com.lms.mims.domain.life.Economic>
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public LayuiResult<Economic> getAll(@RequestParam(value = "page", defaultValue = "1") int page,
                                                   @RequestParam(value = "limit", defaultValue = "0") int limit) {
        return this.economicService.queryAll(page, limit);
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-03 15:48
     * @param economic
     * @return java.lang.String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Economic economic) {
        return economicService.add(economic);
    }

    /**
     * @description 更新
     * @author louiemain
     * @date Created on 2018-01-03 16:57
     * @param economic
     * @return java.lang.String
     */
    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    public String upd(Economic economic) {
        return this.economicService.updById(economic);
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2018-01-03 16:52
     * @param ecoid
     * @return java.lang.String
     */
    @RequestMapping(value = "/del/{ecoid}", method = RequestMethod.DELETE)
    public String del(@PathVariable("ecoid") int ecoid) {
        Economic economic = new Economic();
        economic.setEcoid(ecoid);
        return this.economicService.delById(economic);
    }
}
