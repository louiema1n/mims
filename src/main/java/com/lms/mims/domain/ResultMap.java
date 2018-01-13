package com.lms.mims.domain;


import java.util.Map;

/**
 * 结果集-map
 */
public class ResultMap {

    private int code;   // 状态码
    private String msg; // 响应信息
    private int count;  // 记录总数
    Map<String, String> data;      // 记录

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
