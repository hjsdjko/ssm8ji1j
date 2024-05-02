package com.entity.model;

import com.entity.ZhanwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 站务管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 22:04:34
 */
public class ZhanwuguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 站点名称
	 */
	
	private String zhandianmingcheng;
		
	/**
	 * 路线
	 */
	
	private String luxian;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 经营范围
	 */
	
	private String jingyingfanwei;
		
	/**
	 * 车票类型
	 */
	
	private String chepiaoleixing;
		
	/**
	 * 管理员工号
	 */
	
	private String guanliyuangonghao;
		
	/**
	 * 管理员姓名
	 */
	
	private String guanliyuanxingming;
		
	/**
	 * 车票售价
	 */
	
	private String chepiaoshoujia;
		
	/**
	 * 车票数量
	 */
	
	private String chepiaoshuliang;
				
	
	/**
	 * 设置：站点名称
	 */
	 
	public void setZhandianmingcheng(String zhandianmingcheng) {
		this.zhandianmingcheng = zhandianmingcheng;
	}
	
	/**
	 * 获取：站点名称
	 */
	public String getZhandianmingcheng() {
		return zhandianmingcheng;
	}
				
	
	/**
	 * 设置：路线
	 */
	 
	public void setLuxian(String luxian) {
		this.luxian = luxian;
	}
	
	/**
	 * 获取：路线
	 */
	public String getLuxian() {
		return luxian;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：经营范围
	 */
	 
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
				
	
	/**
	 * 设置：车票类型
	 */
	 
	public void setChepiaoleixing(String chepiaoleixing) {
		this.chepiaoleixing = chepiaoleixing;
	}
	
	/**
	 * 获取：车票类型
	 */
	public String getChepiaoleixing() {
		return chepiaoleixing;
	}
				
	
	/**
	 * 设置：管理员工号
	 */
	 
	public void setGuanliyuangonghao(String guanliyuangonghao) {
		this.guanliyuangonghao = guanliyuangonghao;
	}
	
	/**
	 * 获取：管理员工号
	 */
	public String getGuanliyuangonghao() {
		return guanliyuangonghao;
	}
				
	
	/**
	 * 设置：管理员姓名
	 */
	 
	public void setGuanliyuanxingming(String guanliyuanxingming) {
		this.guanliyuanxingming = guanliyuanxingming;
	}
	
	/**
	 * 获取：管理员姓名
	 */
	public String getGuanliyuanxingming() {
		return guanliyuanxingming;
	}
				
	
	/**
	 * 设置：车票售价
	 */
	 
	public void setChepiaoshoujia(String chepiaoshoujia) {
		this.chepiaoshoujia = chepiaoshoujia;
	}
	
	/**
	 * 获取：车票售价
	 */
	public String getChepiaoshoujia() {
		return chepiaoshoujia;
	}
				
	
	/**
	 * 设置：车票数量
	 */
	 
	public void setChepiaoshuliang(String chepiaoshuliang) {
		this.chepiaoshuliang = chepiaoshuliang;
	}
	
	/**
	 * 获取：车票数量
	 */
	public String getChepiaoshuliang() {
		return chepiaoshuliang;
	}
			
}
