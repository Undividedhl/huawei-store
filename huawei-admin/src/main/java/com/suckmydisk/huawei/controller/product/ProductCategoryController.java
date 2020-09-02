package com.suckmydisk.huawei.controller.product;

import com.suckmydisk.huawei.common.core.controller.BaseController;
import com.suckmydisk.huawei.common.core.domain.AjaxResult;
import com.suckmydisk.huawei.common.core.page.PageDataInfo;
import com.suckmydisk.huawei.common.exception.BaseException;
import com.suckmydisk.huawei.entity.ProductCategory;
import com.suckmydisk.huawei.service.ProductCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
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
public class ProductCategoryController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 查询所有数据
     *
     * @return 分页数据
     */
    @GetMapping("/productCategories")
    @ApiOperation("获取分页数据")
    public AjaxResult getProductCategory() {
        startPage();
        List<ProductCategory> productCategories = productCategoryService.queryAll();
        PageDataInfo pageDataInfo = new PageDataInfo(productCategories.size(), productCategories);

        return AjaxResult.success(pageDataInfo);
    }

    /**
     * 根据ID获取单条数据
     * 
     * @param id
     * @return 单条数据
     */
    @GetMapping("/productCategories/{id}")
    @ApiOperation("根据ID获取单条数据")
    public AjaxResult getProductCategoryById(@PathVariable("id") long id) {
        return AjaxResult.success(productCategoryService.queryById(id));
    }

    /**
     * 新增一条数据
     * 
     * @param productCategory
     */
    @PostMapping("/productCategories")
    @ApiOperation("新增一条数据")
    public AjaxResult addProductCategory(@RequestBody @Validated ProductCategory productCategory) {
        productCategoryService.insert(productCategory);
        return AjaxResult.success();
    }

    /**
     * 根据ID删除数据
     * 
     * @param id
     */
    @DeleteMapping("/productCategories/{id}")
    @ApiOperation("根据ID删除数据")
    public AjaxResult deleteProductCategory(@PathVariable("id") long id) {
        productCategoryService.deleteById(id);
        return AjaxResult.success();
    }

    /**
     * 更新数据
     * 
     * @param productCategory
     */
    @PutMapping("/productCategories")
    @ApiOperation("更新数据")
    public AjaxResult updateProductCategory(@RequestBody @Validated ProductCategory productCategory) {
        Long id = productCategory.getId();
        if (id == null) {
            throw new BaseException("参数为空");
        }
        productCategoryService.update(productCategory);
        return AjaxResult.success();
    }
}