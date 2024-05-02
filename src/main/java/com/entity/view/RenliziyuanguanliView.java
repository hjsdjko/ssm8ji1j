package com.entity.view;

import com.entity.RenliziyuanguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人力资源管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("renliziyuanguanli")
public class RenliziyuanguanliView  extends RenliziyuanguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenliziyuanguanliView(){
	}
 
 	public RenliziyuanguanliView(RenliziyuanguanliEntity renliziyuanguanliEntity){
 	try {
			BeanUtils.copyProperties(this, renliziyuanguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
