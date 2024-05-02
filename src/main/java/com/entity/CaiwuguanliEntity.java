package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 财务管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("caiwuguanli")
public class CaiwuguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaiwuguanliEntity() {
		
	}
	
	public CaiwuguanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 时间类型
	 */
					
	private String shijianleixing;
	
	/**
	 * 开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaishishijian;
	
	/**
	 * 截止时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：时间类型
	 */
	public void setShijianleixing(String shijianleixing) {
		this.shijianleixing = shijianleixing;
	}
	/**
	 * 获取：时间类型
	 */
	public String getShijianleixing() {
		return shijianleixing;
	}
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
