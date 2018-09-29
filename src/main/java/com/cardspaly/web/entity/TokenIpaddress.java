/**
 * 
 */
package com.cardspaly.web.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project: cardspaly
 * @Description token和IP关联实体类
 * @author Mr.Silence
 * @date 2018年9月26日 
 * @version V1.0
 */
@Entity
@Table(name="t_tokenIpaddress")
@Setter
@Getter
public class TokenIpaddress {
	
	@Id
	@GeneratedValue
	private Integer id; // 编号
    @Column(length=9)
	private Integer token; // 用户名
	@Column(length=15)
	private String ipaddress; // 密码
	

}
