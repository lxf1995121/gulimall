package com.xf.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xf.common.utils.PageUtils;
import com.xf.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:31:23
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

