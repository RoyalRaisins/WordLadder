package com.example.demo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * 页面请求参数对应实体
 * @Description:
 * @Author:libin
 * @Date: Created in 15:34 2017/11/13
 */
public class RequestVo {

    @NotEmpty(message="Empty path!")
    private String path;

    @NotEmpty(message = "Empty word!")
    private String start;

    @NotEmpty(message = "Empty word!")
    private String end;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end = end;
    }
}