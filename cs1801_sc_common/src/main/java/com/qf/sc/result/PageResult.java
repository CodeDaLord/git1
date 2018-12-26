package com.qf.sc.result;

import java.io.Serializable;
import java.util.List;

//angular的分页插件要求返回的格式
public class PageResult<T> implements Serializable{
    // 工多少条
    private Long total;
    // 一页的结果集和
    private List<T> rows;
    // 一夜显示几条
    private Long size;
    //共多少页
    private Long pages;
    //当前页码
    private Long pageno;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getPages() {
        return (total+size-1)/size;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPageno() {
        return pageno;
    }

    public void setPageno(Long pageno) {
        this.pageno = pageno;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Long getPrePageno(){
        if(pageno==1){
            return 1L;
        }else{
            return pageno-1;
        }
    }

    public Long getNextPageno(){
        if(pageno==this.getPages()){
            return this.getPages();
        }else{
            return pageno+1;
        }
    }
    public PageResult() {
    }
    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                ", size=" + size +
                ", pages=" + this.getPages() +
                ", pageno=" + pageno +
                '}';
    }
}
