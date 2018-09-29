package com.cardspaly.web.service;


import java.util.List;

import org.springframework.data.repository.query.Param;

import com.cardspaly.web.entity.TokenIpaddress;

/**
 * @Project: cardspaly
 * @Description token和IP关联Service接口
 * @author silence
 * @date 2018年9月26日
 * @version V1.0
 */

public interface TokenIpaddressService {

	/**
	 * 修改或者修改用户信息
	 * @param user
	 */
	public void save(TokenIpaddress tokenIpaddress);
	

	/**
	 * 查找所有结果集
	 * @param id
	 * @return
	 */
	public  List<TokenIpaddress>  find();
	
	/**
	 * 根据token更改IP
	 * @param token
	 * @param ipaddress
	 */
	public void updateIpaddressByToken(Integer token,String ipaddress);

	
	
}
