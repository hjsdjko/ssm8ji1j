package com.entity.view;

import com.entity.YewuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("yewuguanli")
public class YewuguanliView  extends YewuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewuguanliView(){
	}
 
 	public YewuguanliView(YewuguanliEntity yewuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, yewuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
