package com.gao.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gao.common.utils.PageUtils;
import com.gao.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:42:21
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

