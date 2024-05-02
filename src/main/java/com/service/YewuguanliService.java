package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuguanliView;


/**
 * 业务管理
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface YewuguanliService extends IService<YewuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuguanliVO> selectListVO(Wrapper<YewuguanliEntity> wrapper);
   	
   	YewuguanliVO selectVO(@Param("ew") Wrapper<YewuguanliEntity> wrapper);
   	
   	List<YewuguanliView> selectListView(Wrapper<YewuguanliEntity> wrapper);
   	
   	YewuguanliView selectView(@Param("ew") Wrapper<YewuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuguanliEntity> wrapper);
   	
}

