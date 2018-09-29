package com.cardspaly.web.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cardspaly.web.entity.TokenIpaddress;
import com.cardspaly.web.repository.TokenIpaddressRepository;
import com.cardspaly.web.service.TokenIpaddressService;

/**
 * @Project: cardspaly
 * @Description Token和IP关联Service实现类
 * @author silence
 * @date 2018年9月26日
 * @version V1.0
 */

@Service("TokenIpaddressService")
public class TokenIpaddressServiceImpl implements TokenIpaddressService{

	@Resource
	private TokenIpaddressRepository tokenIpaddressRepository;
	
	@Override
	public void save(TokenIpaddress tokenIpaddress) {
		tokenIpaddressRepository.save(tokenIpaddress);
	}

	/* (non-Javadoc)
	 * @see com.cardspaly.web.service.TokenIpaddressService#find()
	 */
	@Override
	public List<TokenIpaddress> find() {
		
		return tokenIpaddressRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.cardspaly.web.service.TokenIpaddressService#updateIpaddressByToken(java.lang.String, java.lang.String)
	 */
	@Override
	public void updateIpaddressByToken(Integer token, String ipaddress) {
		tokenIpaddressRepository.updateIpaddressByToken(token, ipaddress);
	}




}
