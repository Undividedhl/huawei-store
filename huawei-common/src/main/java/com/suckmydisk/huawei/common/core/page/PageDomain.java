package com.suckmydisk.huawei.common.core.page;

import org.springframework.util.StringUtils;

/**
 * 分页对象
 *
 * @author 10199
 * @date 2020/8/31
 */

public class PageDomain {

    /** 起始页 */
    private Integer page;

    /** 每页显示的记录数 */
    private Integer pageSize;

    /** 排序列 */
    private String orderByColumn;

    /** 排序方向desc或者asc */
    private String sortDirection = "asc";

    /**
     * 获取排序列与排序方向
     *
     * @return
     */
    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "" + sortDirection;
        }
        return orderByColumn + " " + sortDirection;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
}
