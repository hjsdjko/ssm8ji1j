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


import com.dao.CaiwuguanliDao;
import com.entity.CaiwuguanliEntity;
import com.service.CaiwuguanliService;
import com.entity.vo.CaiwuguanliVO;
import com.entity.view.CaiwuguanliView;

@Service("caiwuguanliService")
public class CaiwuguanliServiceImpl extends ServiceImpl<CaiwuguanliDao, CaiwuguanliEntity> implements CaiwuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwuguanliEntity> page = this.selectPage(
                new Query<CaiwuguanliEntity>(params).getPage(),
                new EntityWrapper<CaiwuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwuguanliEntity> wrapper) {
		  Page<CaiwuguanliView> page =new Query<CaiwuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwuguanliVO> selectListVO(Wrapper<CaiwuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwuguanliVO selectVO(Wrapper<CaiwuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwuguanliView> selectListView(Wrapper<CaiwuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwuguanliView selectView(Wrapper<CaiwuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
