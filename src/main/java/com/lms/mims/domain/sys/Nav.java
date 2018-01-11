package com.lms.mims.domain.sys;

import java.util.List;

/**
 * @description 系统导航
 * @author&date Created by louiemain on 2018-01-10 10:07
 */
public class Nav {

    private int id;
    private String name;
    private String icon;
    private String url;
    private int uplevel;

    private List<Dict> children;

    public List<Dict> getChildren() {
        return children;
    }

    public void setChildren(List<Dict> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getUplevel() {
        return uplevel;
    }

    public void setUplevel(int uplevel) {
        this.uplevel = uplevel;
    }
}
