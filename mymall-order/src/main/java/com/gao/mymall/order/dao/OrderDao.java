package com.gao.mymall.order.dao;

import com.gao.mymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:51:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
