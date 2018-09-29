package com.cardspaly.web.service;

import com.cardspaly.web.entity.RoleMenu;

/**
 * @Project: cardspaly
 * @Description 角色权限关联Service接口
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

public interface RoleMenuService {

	/**
	 * 根据角色id删除所有关联信息
	 * @param id
	 */
	public void deleteByRoleId(Integer roleId);
	
	/**
	 * 保存
	 * @param roleMenu
	 */
	public void save(RoleMenu roleMenu);
}
