package com.gao.mymall.member.dao;

import com.gao.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gaolijie
 * @email gaolijie@163.com
 * @date 2022-05-01 23:42:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
