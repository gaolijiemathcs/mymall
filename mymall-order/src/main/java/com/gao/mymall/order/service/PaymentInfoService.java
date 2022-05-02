package com.gao.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:51:44
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

