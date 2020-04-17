package com.xf.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xf.common.utils.PageUtils;
import com.xf.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:35:39
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

