package com.cardspaly.web.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cardspaly.web.entity.UserRole;

/**
 * @Project: cardspaly
 * @Description 用户角色关联Repository接口
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

public interface UserRoleRepository extends JpaRepository<UserRole, Integer>,JpaSpecificationExecutor<UserRole>{


	
	/**
	 * 根据用户id删除所有关联信息
	 * @param userId
	 */
	@Query(value="delete from t_user_role where user_id=?1",nativeQuery=true)
	@Modifying
	public void deleteByUserId(Integer userId);
	
	
	/**
	 * 根据角色id删除所有关联信息
	 * @param id
	 */
	@Query(value="delete from t_user_role where role_id=?1",nativeQuery=true)
	@Modifying
	public void deleteByRoleId(Integer roleId);
}
