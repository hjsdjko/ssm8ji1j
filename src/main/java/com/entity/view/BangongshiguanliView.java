package com.entity.view;

import com.entity.BangongshiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 办公室管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("bangongshiguanli")
public class BangongshiguanliView  extends BangongshiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BangongshiguanliView(){
	}
 
 	public BangongshiguanliView(BangongshiguanliEntity bangongshiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, bangongshiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
