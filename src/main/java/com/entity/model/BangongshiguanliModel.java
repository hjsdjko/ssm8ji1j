package com.entity.model;

import com.entity.BangongshiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 办公室管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public class BangongshiguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 办公室名称
	 */
	
	private String bangongshimingcheng;
		
	/**
	 * 办公室地址
	 */
	
	private String bangongshidizhi;
		
	/**
	 * 部长
	 */
	
	private String buzhang;
		
	/**
	 * 部门职责
	 */
	
	private String bumenzhize;
		
	/**
	 * 工作报告
	 */
	
	private String gongzuobaogao;
		
	/**
	 * 工作计划
	 */
	
	private String gongzuojihua;
		
	/**
	 * 工作时长
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gongzuoshizhang;
				
	
	/**
	 * 设置：办公室名称
	 */
	 
	public void setBangongshimingcheng(String bangongshimingcheng) {
		this.bangongshimingcheng = bangongshimingcheng;
	}
	
	/**
	 * 获取：办公室名称
	 */
	public String getBangongshimingcheng() {
		return bangongshimingcheng;
	}
				
	
	/**
	 * 设置：办公室地址
	 */
	 
	public void setBangongshidizhi(String bangongshidizhi) {
		this.bangongshidizhi = bangongshidizhi;
	}
	
	/**
	 * 获取：办公室地址
	 */
	public String getBangongshidizhi() {
		return bangongshidizhi;
	}
				
	
	/**
	 * 设置：部长
	 */
	 
	public void setBuzhang(String buzhang) {
		this.buzhang = buzhang;
	}
	
	/**
	 * 获取：部长
	 */
	public String getBuzhang() {
		return buzhang;
	}
				
	
	/**
	 * 设置：部门职责
	 */
	 
	public void setBumenzhize(String bumenzhize) {
		this.bumenzhize = bumenzhize;
	}
	
	/**
	 * 获取：部门职责
	 */
	public String getBumenzhize() {
		return bumenzhize;
	}
				
	
	/**
	 * 设置：工作报告
	 */
	 
	public void setGongzuobaogao(String gongzuobaogao) {
		this.gongzuobaogao = gongzuobaogao;
	}
	
	/**
	 * 获取：工作报告
	 */
	public String getGongzuobaogao() {
		return gongzuobaogao;
	}
				
	
	/**
	 * 设置：工作计划
	 */
	 
	public void setGongzuojihua(String gongzuojihua) {
		this.gongzuojihua = gongzuojihua;
	}
	
	/**
	 * 获取：工作计划
	 */
	public String getGongzuojihua() {
		return gongzuojihua;
	}
				
	
	/**
	 * 设置：工作时长
	 */
	 
	public void setGongzuoshizhang(Date gongzuoshizhang) {
		this.gongzuoshizhang = gongzuoshizhang;
	}
	
	/**
	 * 获取：工作时长
	 */
	public Date getGongzuoshizhang() {
		return gongzuoshizhang;
	}
			
}
