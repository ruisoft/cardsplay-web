package com.cardspaly.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project: cardspaly
 * @Description 菜单实体
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

@Entity
@Table(name="t_menu")
@Getter
@Setter
public class Menu {
	
	@Id
	@GeneratedValue
	private Integer id; // 编号
	
	@Column(length=50)
	private String name; // 菜名名称
	
	@Column(length=200)
	private String url; // 菜单地址
	
	private Integer state; // 菜单节点类型 1 根节点 0 叶子节点
	
	@Column(length=100)
	private String icon; // 图标
	
	private Integer pId; // 父菜单Id


	
	
	
}
