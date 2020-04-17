package com.xf.gulimall.order.dao;

import com.xf.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:35:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
