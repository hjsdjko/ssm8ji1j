package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwuguanliView;


/**
 * 财务管理
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface CaiwuguanliService extends IService<CaiwuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwuguanliVO> selectListVO(Wrapper<CaiwuguanliEntity> wrapper);
   	
   	CaiwuguanliVO selectVO(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
   	
   	List<CaiwuguanliView> selectListView(Wrapper<CaiwuguanliEntity> wrapper);
   	
   	CaiwuguanliView selectView(@Param("ew") Wrapper<CaiwuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwuguanliEntity> wrapper);
   	
}

