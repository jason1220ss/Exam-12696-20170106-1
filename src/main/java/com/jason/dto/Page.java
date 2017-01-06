package com.jason.dto;

/**
 * Created by jason on 2017/1/4.
 */
public class Page<T> {
    //当前页
    private int currentPage;
    //每页显示最大记录
    private int pageSize;
    //分页实体
    private T t;

    public int getCurrentPage() {
        return currentPage;
    }

    public Page setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getStart() {
        return (currentPage - 1) * pageSize;
    }

    public T getT() {
        return t;
    }

    public Page setT(T t) {
        this.t = t;
        return this;
    }
}
