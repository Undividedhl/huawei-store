package com.suckmydisk.huawei.controller.product;

import com.suckmydisk.huawei.common.core.controller.BaseController;
import com.suckmydisk.huawei.common.core.domain.AjaxResult;
import com.suckmydisk.huawei.service.ProductCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 分类表(ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-08-14 10:09:48
 */
@RestController
public class ProductCategoryController extends BaseController {
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
    @GetMapping("/productCategories/{id}")
    @ApiOperation("分页获取产品分类")
    public AjaxResult queryAll() {
        startPage();
//        List<ProductCategory> productCategories = productCategoryService.queryAllByPage();
//        PageInfo<ProductCategory> pageInfo = new PageInfo<>(productCategories);

//        return AjaxResult.success(pageInfo);
        return null;
    }


}