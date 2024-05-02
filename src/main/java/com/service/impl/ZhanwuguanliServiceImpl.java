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


import com.dao.ZhanwuguanliDao;
import com.entity.ZhanwuguanliEntity;
import com.service.ZhanwuguanliService;
import com.entity.vo.ZhanwuguanliVO;
import com.entity.view.ZhanwuguanliView;

@Service("zhanwuguanliService")
public class ZhanwuguanliServiceImpl extends ServiceImpl<ZhanwuguanliDao, ZhanwuguanliEntity> implements ZhanwuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanwuguanliEntity> page = this.selectPage(
                new Query<ZhanwuguanliEntity>(params).getPage(),
                new EntityWrapper<ZhanwuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanwuguanliEntity> wrapper) {
		  Page<ZhanwuguanliView> page =new Query<ZhanwuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanwuguanliVO> selectListVO(Wrapper<ZhanwuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanwuguanliVO selectVO(Wrapper<ZhanwuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanwuguanliView> selectListView(Wrapper<ZhanwuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanwuguanliView selectView(Wrapper<ZhanwuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
