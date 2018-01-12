package com.lms.mims.utils;

import org.springframework.core.io.Resource;

import java.io.*;

/**
 * @description Json相关工具类
 * @author&date Created by louiemain on 2018/1/12 20:22
 */
public class JsonUtil {

    /**
     * @description 读取JsonFile返回json 字符串
     * @author louiemain
     * @date Created on 2018/1/12 20:23
     * @param resource
     * @return java.lang.String
     */
    public String fromFileJson2String(Resource resource) {
        BufferedReader br = null;
        String str = "";
        try {
            InputStreamReader isr = new InputStreamReader(resource.getInputStream(), "UTF-8");
            br = new BufferedReader(isr);

            String tempStr = null;
            while ((tempStr = br.readLine()) != null) {
                str += tempStr;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        str = str.replace("\r\n", "").replaceAll(" +", "");
        return str;
    }
}
