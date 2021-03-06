package com.suckmydisk.huawei.common.core.page;

import com.suckmydisk.huawei.common.ServletUtils;

/**
 * 表格数据处理
 *
 * @author Coriander
 * @date 2020/8/31
 */

public class PageSupport {

    /**
     * 当前记录起始索引
     */
    public static final String PAGE = "page";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String SORT_DIRECTION = "sortDirection";

    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPage(ServletUtils.getParameterToInt(PAGE));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(ORDER_BY_COLUMN));
        pageDomain.setSortDirection(ServletUtils.getParameter(SORT_DIRECTION));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
