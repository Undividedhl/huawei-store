package com.suckmydisk.huawei.controller.product;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suckmydisk.huawei.core.domain.AjaxResult;
import com.suckmydisk.huawei.entity.ProductCategory;
import com.suckmydisk.huawei.service.ProductCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分类表(ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-08-14 10:09:48
 */
@RestController
@RequestMapping("productCategories")
public class ProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @return 产品分类分页数据
     */
    @GetMapping("/{id}")
    @ApiOperation("分页获取产品分类")
    public AjaxResult queryAll(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "15") int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<ProductCategory> productCategories = productCategoryService.queryAllByPage(page, pageSize);
        PageInfo<ProductCategory> pageInfo = new PageInfo<>(productCategories);

        return AjaxResult.success(pageInfo);
    }


}