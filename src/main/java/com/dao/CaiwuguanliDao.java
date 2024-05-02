package com.dao;

import com.entity.CaiwuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwuguanliVO;
import com.entity.view.CaiwuguanliView;


/**
 * 财务管理
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface CaiwuguanliDao extends BaseMapper<CaiwuguanliEntity> {
	
	List<CaiwuguanliVO> selectListVO(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
	
	CaiwuguanliVO selectVO(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
	
	List<CaiwuguanliView> selectListView(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);

	List<CaiwuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
	
	CaiwuguanliView selectView(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
	
}
