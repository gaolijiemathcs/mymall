package com.gao.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 20:51:59
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

