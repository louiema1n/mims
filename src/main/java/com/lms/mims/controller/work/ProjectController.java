package com.lms.mims.controller.work;

import com.lms.mims.domain.LayuiResult;
import com.lms.mims.domain.work.Project;
import com.lms.mims.service.work.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * project控制器
 */
@RestController
@RequestMapping("/prj")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 获取所有tmpitem
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public LayuiResult<Project> getAll() {
        LayuiResult<Project> projectResultSet = new LayuiResult<>();
        projectResultSet.setCode(0);
        projectResultSet.setMsg("查询成功");
        projectResultSet.setCount(this.projectService.queryAll().size());
        projectResultSet.setData(this.projectService.queryAll());
        return projectResultSet;
    }
}
