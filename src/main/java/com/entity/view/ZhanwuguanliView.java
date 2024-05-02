package com.entity.view;

import com.entity.ZhanwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 站务管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("zhanwuguanli")
public class ZhanwuguanliView  extends ZhanwuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanwuguanliView(){
	}
 
 	public ZhanwuguanliView(ZhanwuguanliEntity zhanwuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, zhanwuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
