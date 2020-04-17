package com.xf.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xf.common.utils.PageUtils;
import com.xf.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-12 18:36:53
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

