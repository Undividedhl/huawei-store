package com.suckmydisk.huawei.service;

import com.suckmydisk.huawei.entity.ProductCategory;

import java.util.List;

/**
 * 分类表(ProductCategory)表服务接口
 *
 * @author makejava
 * @since 2020-08-14 10:09:32
 */
public interface ProductCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductCategory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param page 查询起始页
     * @param pageSize  查询条数
     * @return 对象列表
     */
    List<ProductCategory> queryAllByPage(int page, int pageSize);

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    ProductCategory insert(ProductCategory productCategory);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    ProductCategory update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}