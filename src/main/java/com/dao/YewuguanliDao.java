package com.dao;

import com.entity.YewuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuguanliVO;
import com.entity.view.YewuguanliView;


/**
 * 业务管理
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface YewuguanliDao extends BaseMapper<YewuguanliEntity> {
	
	List<YewuguanliVO> selectListVO(@Param("ew") Wrapper<YewuguanliEntity> wrapper);
	
	YewuguanliVO selectVO(@Param("ew") Wrapper<YewuguanliEntity> wrapper);
	
	List<YewuguanliView> selectListView(@Param("ew") Wrapper<YewuguanliEntity> wrapper);

	List<YewuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YewuguanliEntity> wrapper);
	
	YewuguanliView selectView(@Param("ew") Wrapper<YewuguanliEntity> wrapper);
	
}
