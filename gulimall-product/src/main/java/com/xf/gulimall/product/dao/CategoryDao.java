package com.xf.gulimall.product.dao;

import com.xf.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liuxiaofeng
 * @email lxf1995@aliyun.com
 * @date 2020-04-11 22:47:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
