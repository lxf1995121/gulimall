package com.xf.gulimall.member.dao;

import com.xf.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:33:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
