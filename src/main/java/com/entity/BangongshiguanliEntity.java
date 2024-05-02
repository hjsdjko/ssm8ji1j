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
 * 办公室管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
@TableName("bangongshiguanli")
public class BangongshiguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BangongshiguanliEntity() {
		
	}
	
	public BangongshiguanliEntity(T t) {
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
	 * 办公室编号
	 */
					
	private String bangongshibianhao;
	
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
	 * 设置：办公室编号
	 */
	public void setBangongshibianhao(String bangongshibianhao) {
		this.bangongshibianhao = bangongshibianhao;
	}
	/**
	 * 获取：办公室编号
	 */
	public String getBangongshibianhao() {
		return bangongshibianhao;
	}
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
