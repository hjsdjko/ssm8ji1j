package com.dao;

import com.entity.RenliziyuanguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenliziyuanguanliVO;
import com.entity.view.RenliziyuanguanliView;


/**
 * 人力资源管理
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface RenliziyuanguanliDao extends BaseMapper<RenliziyuanguanliEntity> {
	
	List<RenliziyuanguanliVO> selectListVO(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
	
	RenliziyuanguanliVO selectVO(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
	
	List<RenliziyuanguanliView> selectListView(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);

	List<RenliziyuanguanliView> selectListView(Pagination page,@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
	
	RenliziyuanguanliView selectView(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
	
}
