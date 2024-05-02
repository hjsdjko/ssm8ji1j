package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenliziyuanguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenliziyuanguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenliziyuanguanliView;


/**
 * 人力资源管理
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface RenliziyuanguanliService extends IService<RenliziyuanguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenliziyuanguanliVO> selectListVO(Wrapper<RenliziyuanguanliEntity> wrapper);
   	
   	RenliziyuanguanliVO selectVO(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
   	
   	List<RenliziyuanguanliView> selectListView(Wrapper<RenliziyuanguanliEntity> wrapper);
   	
   	RenliziyuanguanliView selectView(@Param("ew") Wrapper<RenliziyuanguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenliziyuanguanliEntity> wrapper);
   	
}

