package com.suckmydisk.huawei.dao;


import com.suckmydisk.huawei.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 分类表(ProductCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-14 10:09:32
 */
@Mapper
public interface ProductCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param page 查询起始位置
     * @param pageSize  查询条数
     * @return 对象列表
     */
    List<ProductCategory> queryAllByPage(@Param("page") int page, @Param("pageSize") int pageSize);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productCategory 实例对象
     * @return 对象列表
     */
    List<ProductCategory> queryAll(ProductCategory productCategory);

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 影响行数
     */
    int insert(ProductCategory productCategory);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 影响行数
     */
    int update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}