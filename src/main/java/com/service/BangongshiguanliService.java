package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BangongshiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BangongshiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BangongshiguanliView;


/**
 * 办公室管理
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface BangongshiguanliService extends IService<BangongshiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BangongshiguanliVO> selectListVO(Wrapper<BangongshiguanliEntity> wrapper);
   	
   	BangongshiguanliVO selectVO(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
   	
   	List<BangongshiguanliView> selectListView(Wrapper<BangongshiguanliEntity> wrapper);
   	
   	BangongshiguanliView selectView(@Param("ew") Wrapper<BangongshiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BangongshiguanliEntity> wrapper);
   	
}

