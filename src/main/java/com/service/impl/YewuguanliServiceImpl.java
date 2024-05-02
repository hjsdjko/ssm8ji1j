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


import com.dao.YewuguanliDao;
import com.entity.YewuguanliEntity;
import com.service.YewuguanliService;
import com.entity.vo.YewuguanliVO;
import com.entity.view.YewuguanliView;

@Service("yewuguanliService")
public class YewuguanliServiceImpl extends ServiceImpl<YewuguanliDao, YewuguanliEntity> implements YewuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuguanliEntity> page = this.selectPage(
                new Query<YewuguanliEntity>(params).getPage(),
                new EntityWrapper<YewuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuguanliEntity> wrapper) {
		  Page<YewuguanliView> page =new Query<YewuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuguanliVO> selectListVO(Wrapper<YewuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuguanliVO selectVO(Wrapper<YewuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuguanliView> selectListView(Wrapper<YewuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuguanliView selectView(Wrapper<YewuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
