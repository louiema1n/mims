package com.lms.mims.service;

import com.lms.mims.domain.Project;
import com.lms.mims.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 查询所有project
     * @return
     */
    public List<Project> queryAll() {
        return this.projectMapper.selectAll();
    }
}
