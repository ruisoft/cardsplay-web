package com.cardspaly.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cardspaly.web.entity.TokenIpaddress;
import com.cardspaly.web.entity.User;

/**
 * @Project: cardspaly
 * @Description token和ip关联Repository接口
 * @author silence
 * @date 2018年9月26日
 * @version V1.0
 */

public interface TokenIpaddressRepository extends JpaRepository<TokenIpaddress, Integer>,JpaSpecificationExecutor<TokenIpaddress>{

	/**
	 * 根据token更改IP
	 * @param token
	 * @param ipaddress
	 */
	@Transactional
	@Modifying(clearAutomatically = true)
	 @Query(value = "update t_token_ipaddress t set t.ipaddress=?2 where t.token =?1" ,nativeQuery=true)
	public void updateIpaddressByToken(@Param("token") Integer token,@Param("ipaddress") String ipaddress);
}
