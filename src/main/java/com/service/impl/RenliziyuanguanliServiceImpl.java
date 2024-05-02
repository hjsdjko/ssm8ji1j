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


import com.dao.RenliziyuanguanliDao;
import com.entity.RenliziyuanguanliEntity;
import com.service.RenliziyuanguanliService;
import com.entity.vo.RenliziyuanguanliVO;
import com.entity.view.RenliziyuanguanliView;

@Service("renliziyuanguanliService")
public class RenliziyuanguanliServiceImpl extends ServiceImpl<RenliziyuanguanliDao, RenliziyuanguanliEntity> implements RenliziyuanguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenliziyuanguanliEntity> page = this.selectPage(
                new Query<RenliziyuanguanliEntity>(params).getPage(),
                new EntityWrapper<RenliziyuanguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenliziyuanguanliEntity> wrapper) {
		  Page<RenliziyuanguanliView> page =new Query<RenliziyuanguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenliziyuanguanliVO> selectListVO(Wrapper<RenliziyuanguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenliziyuanguanliVO selectVO(Wrapper<RenliziyuanguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenliziyuanguanliView> selectListView(Wrapper<RenliziyuanguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenliziyuanguanliView selectView(Wrapper<RenliziyuanguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
