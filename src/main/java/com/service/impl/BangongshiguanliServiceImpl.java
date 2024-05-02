package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BangongshiguanliDao;
import com.entity.BangongshiguanliEntity;
import com.service.BangongshiguanliService;
import com.entity.vo.BangongshiguanliVO;
import com.entity.view.BangongshiguanliView;

@Service("bangongshiguanliService")
public class BangongshiguanliServiceImpl extends ServiceImpl<BangongshiguanliDao, BangongshiguanliEntity> implements BangongshiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BangongshiguanliEntity> page = this.selectPage(
                new Query<BangongshiguanliEntity>(params).getPage(),
                new EntityWrapper<BangongshiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BangongshiguanliEntity> wrapper) {
		  Page<BangongshiguanliView> page =new Query<BangongshiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BangongshiguanliVO> selectListVO(Wrapper<BangongshiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BangongshiguanliVO selectVO(Wrapper<BangongshiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BangongshiguanliView> selectListView(Wrapper<BangongshiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BangongshiguanliView selectView(Wrapper<BangongshiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
