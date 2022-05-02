package com.gao.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:51:44
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

