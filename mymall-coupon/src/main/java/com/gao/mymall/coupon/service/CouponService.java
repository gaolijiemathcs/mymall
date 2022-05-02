package com.gao.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 20:51:59
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

