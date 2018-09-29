package com.cardspaly.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project: cardspaly
 * @Description 用户角色关联实体
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

@Entity
@Table(name="t_userRole")
@Setter
@Getter
public class UserRole {

	@Id
	@GeneratedValue
	private Integer id; // 编号
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user; // 用户
	
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role; // 角色


	
	
	
}
