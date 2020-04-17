package com.xf.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xf.common.utils.PageUtils;
import com.xf.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:31:23
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

