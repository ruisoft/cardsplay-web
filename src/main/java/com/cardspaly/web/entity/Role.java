package com.cardspaly.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Project: cardspaly
 * @Description 角色实体
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

@Entity
@Table(name="t_role")
@Getter
@Setter
@ToString
public class Role {
	
	@Id
	@GeneratedValue
	private Integer id; // 编号
	
	@Column(length=50)
	private String name; // 角色名称
	
	
	@Column(length=1000)
	private String remarks; // 备注

}
