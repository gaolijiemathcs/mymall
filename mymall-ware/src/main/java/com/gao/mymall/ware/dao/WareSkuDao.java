package com.gao.mymall.ware.dao;

import com.gao.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:56:46
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
