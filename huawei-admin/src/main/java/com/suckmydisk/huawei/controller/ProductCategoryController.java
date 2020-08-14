package com.suckmydisk.huawei.controller;

import com.suckmydisk.huawei.entity.ProductCategory;
import com.suckmydisk.huawei.service.ProductCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 分类表(ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-08-14 10:09:48
 */
@RestController
@RequestMapping("productCategory")
public class ProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductCategory selectOne(Long id) {
        return this.productCategoryService.queryById(id);
    }

}