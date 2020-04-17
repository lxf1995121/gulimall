package com.xf.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xf.common.utils.PageUtils;
import com.xf.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:35:39
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

