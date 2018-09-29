package com.cardspaly.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Project: cardspaly
 * @Description 用户实体
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

@Entity
@Table(name="t_user")
@Setter
@Getter
@ToString
public class User {
	
	@Id
	@GeneratedValue
	private Integer id; // 编号
	
	@NotEmpty(message="请输入用户名!")
	@Column(length=50)
	private String userName; // 用户名
	
	@NotEmpty(message="请输入密码!")
	@Column(length=50)
	private String password; // 密码
	
	@Column(length=50)
	private String trueName; // 真实姓名
	
	@Column(length=1000)
	private String remarks; // 备注
	
	@Transient
	private String roles; // 所拥有的角色

	
	
}
