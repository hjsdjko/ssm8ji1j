package com.entity.view;

import com.entity.CaiwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 财务管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("caiwuguanli")
public class CaiwuguanliView  extends CaiwuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaiwuguanliView(){
	}
 
 	public CaiwuguanliView(CaiwuguanliEntity caiwuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, caiwuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
