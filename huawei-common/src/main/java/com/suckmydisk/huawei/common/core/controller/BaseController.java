package com.suckmydisk.huawei.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.suckmydisk.huawei.common.core.page.PageDomain;
import com.suckmydisk.huawei.common.core.page.PageSupport;
import com.suckmydisk.huawei.common.utils.SqlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @author 10199
 * @date 2020/8/31
 */

public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 设置请求分页数据
     */
    protected void startPage() {
        PageDomain pageDomain = PageSupport.buildPageRequest();
        Integer page = pageDomain.getPage();
        Integer pageSize = pageDomain.getPageSize();
        if (!StringUtils.isEmpty(page) && !StringUtils.isEmpty(pageSize)) {
            String orderBy = SqlUtils.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(page, pageSize, orderBy);
        }
    }

}
