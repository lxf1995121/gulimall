package com.xf.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xf.common.utils.PageUtils;
import com.xf.common.utils.Query;
import com.xf.gulimall.product.dao.CategoryDao;
import com.xf.gulimall.product.entity.CategoryEntity;
import com.xf.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        List<CategoryEntity> collect = categoryEntityList.stream()
                .filter(e -> e.getParentCid() == 0)
                .map(menu->{
                    menu.setChildren(getMenuChildren(menu,categoryEntityList));
                    return menu;
                }).sorted((menu1,menu2)->(menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort())).collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除的菜单是否被引用

        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getMenuChildren(CategoryEntity menu, List<CategoryEntity> categoryEntityList) {
        return categoryEntityList.stream().filter(e->e.getParentCid()==menu.getCatId())
                .map(m->{
                    m.setChildren(getMenuChildren(m,categoryEntityList));
                    return m;
                })
                .sorted((menu1,menu2)->(menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort()))
                .collect(Collectors.toList());
    }

}
