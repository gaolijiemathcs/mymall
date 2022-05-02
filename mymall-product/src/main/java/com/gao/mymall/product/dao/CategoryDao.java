package com.gao.mymall.product.dao;

import com.gao.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 19:36:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
