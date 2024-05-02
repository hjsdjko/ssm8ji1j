package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanwuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanwuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanwuguanliView;


/**
 * 站务管理
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public interface ZhanwuguanliService extends IService<ZhanwuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanwuguanliVO> selectListVO(Wrapper<ZhanwuguanliEntity> wrapper);
   	
   	ZhanwuguanliVO selectVO(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
   	
   	List<ZhanwuguanliView> selectListView(Wrapper<ZhanwuguanliEntity> wrapper);
   	
   	ZhanwuguanliView selectView(@Param("ew") Wrapper<ZhanwuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanwuguanliEntity> wrapper);
   	
}

