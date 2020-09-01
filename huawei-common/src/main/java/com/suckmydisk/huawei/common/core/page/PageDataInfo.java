package com.suckmydisk.huawei.common.core.page;

import java.util.List;

/**
 * @author Coriander
 * @date 2020/9/1
 */

public class PageDataInfo {
    /** 总记录条数 */
    private long total;
    
    /** 列表数据 */
    private List<?> rows;
    
    /** 消息状态码 */
    private int code;
    
    /** 消息内容 */
    private String message;

    public PageDataInfo() {
    }

    public PageDataInfo(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
