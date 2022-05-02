package com.gao.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 19:36:42
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

