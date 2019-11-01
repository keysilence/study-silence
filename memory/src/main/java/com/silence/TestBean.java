package com.silence;

import java.util.List;

/**
 * Created by Silence on 2019/11/1.
 */
public class TestBean {

    public TestBean() {

    }

    public TestBean(List<String> list, Integer size, String name) {
        this.list = list;
        this.size = size;
        this.name = name;
    }

    private List<String> list;

    private Integer size;

    private String name;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
