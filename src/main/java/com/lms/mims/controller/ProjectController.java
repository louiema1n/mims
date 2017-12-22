package com.lms.mims.controller;

import com.lms.mims.domain.Project;
import com.lms.mims.domain.ResultSet;
import com.lms.mims.service.ProjectService;
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
    public ResultSet<Project> getAll() {
        ResultSet<Project> projectResultSet = new ResultSet<>();
        projectResultSet.setCode(0);
        projectResultSet.setMsg("查询成功");
        projectResultSet.setCount(this.projectService.queryAll().size());
        projectResultSet.setData(this.projectService.queryAll());
        return projectResultSet;
    }
}
