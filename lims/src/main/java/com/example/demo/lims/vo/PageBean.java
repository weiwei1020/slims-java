package com.example.demo.lims.vo;

import java.util.List;

/*
@WeiJie
包装类1，用于包装返回给前台的数据
 */
public class PageBean<T> {

    //当前页数
    private int pages;
    //每页显示的记录数
    private int size;
    //总记录数
    private int total;
    //总页数
    private int totalPage;
    //每页的显示的数据
    private List<T> records;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "PageBean [pages=" + pages + ", size=" + size + ", total=" + total + ", totalPage=" + totalPage + ", records="
                + records +  "]";
    }
}
