package com.jason.dto;

import java.util.List;

/**
 * Created by jason on 2017/1/5.
 */
public class ResponseData<T> {
    //总的记录条数
    private int totalCount;
    //每页显示的记录
    private List<T> rows;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
