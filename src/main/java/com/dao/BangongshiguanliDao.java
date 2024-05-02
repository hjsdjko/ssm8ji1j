package com.dao;

import com.entity.BangongshiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BangongshiguanliVO;
import com.entity.view.BangongshiguanliView;


/**
 * 办公室管理
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface BangongshiguanliDao extends BaseMapper<BangongshiguanliEntity> {
	
	List<BangongshiguanliVO> selectListVO(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
	
	BangongshiguanliVO selectVO(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
	
	List<BangongshiguanliView> selectListView(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);

	List<BangongshiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
	
	BangongshiguanliView selectView(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
	
}
