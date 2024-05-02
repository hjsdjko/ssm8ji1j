package com.dao;

import com.entity.ZhanwuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanwuguanliVO;
import com.entity.view.ZhanwuguanliView;


/**
 * 站务管理
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface ZhanwuguanliDao extends BaseMapper<ZhanwuguanliEntity> {
	
	List<ZhanwuguanliVO> selectListVO(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
	
	ZhanwuguanliVO selectVO(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
	
	List<ZhanwuguanliView> selectListView(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);

	List<ZhanwuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
	
	ZhanwuguanliView selectView(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
	
}
