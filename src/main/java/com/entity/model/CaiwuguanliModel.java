package com.entity.model;

import com.entity.CaiwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 财务管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public class CaiwuguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 截止时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhishijian;
		
	/**
	 * 管理费用
	 */
	
	private Integer guanlifeiyong;
		
	/**
	 * 人员费用
	 */
	
	private Integer renyuanfeiyong;
		
	/**
	 * 其它支出
	 */
	
	private Integer qitazhichu;
		
	/**
	 * 抽成收入
	 */
	
	private Integer chouchengshouru;
		
	/**
	 * 其他收入
	 */
	
	private Integer qitashouru;
		
	/**
	 * 利润
	 */
	
	private String lirun;
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：截止时间
	 */
	 
	public void setJiezhishijian(Date jiezhishijian) {
		this.jiezhishijian = jiezhishijian;
	}
	
	/**
	 * 获取：截止时间
	 */
	public Date getJiezhishijian() {
		return jiezhishijian;
	}
				
	
	/**
	 * 设置：管理费用
	 */
	 
	public void setGuanlifeiyong(Integer guanlifeiyong) {
		this.guanlifeiyong = guanlifeiyong;
	}
	
	/**
	 * 获取：管理费用
	 */
	public Integer getGuanlifeiyong() {
		return guanlifeiyong;
	}
				
	
	/**
	 * 设置：人员费用
	 */
	 
	public void setRenyuanfeiyong(Integer renyuanfeiyong) {
		this.renyuanfeiyong = renyuanfeiyong;
	}
	
	/**
	 * 获取：人员费用
	 */
	public Integer getRenyuanfeiyong() {
		return renyuanfeiyong;
	}
				
	
	/**
	 * 设置：其它支出
	 */
	 
	public void setQitazhichu(Integer qitazhichu) {
		this.qitazhichu = qitazhichu;
	}
	
	/**
	 * 获取：其它支出
	 */
	public Integer getQitazhichu() {
		return qitazhichu;
	}
				
	
	/**
	 * 设置：抽成收入
	 */
	 
	public void setChouchengshouru(Integer chouchengshouru) {
		this.chouchengshouru = chouchengshouru;
	}
	
	/**
	 * 获取：抽成收入
	 */
	public Integer getChouchengshouru() {
		return chouchengshouru;
	}
				
	
	/**
	 * 设置：其他收入
	 */
	 
	public void setQitashouru(Integer qitashouru) {
		this.qitashouru = qitashouru;
	}
	
	/**
	 * 获取：其他收入
	 */
	public Integer getQitashouru() {
		return qitashouru;
	}
				
	
	/**
	 * 设置：利润
	 */
	 
	public void setLirun(String lirun) {
		this.lirun = lirun;
	}
	
	/**
	 * 获取：利润
	 */
	public String getLirun() {
		return lirun;
	}
			
}
