package com.cardspaly.web.service;

import java.util.List;

import com.cardspaly.web.entity.Menu;

/**
 * @Project: cardspaly
 * @Description 权限菜单Service实现类
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

public interface MenuService {

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public Menu findById(Integer id);
	
	/**
	 * 根据id获取权限菜单集合
	 * @param userId
	 * @return
	 */
	public List<Menu> findByRoleId(int roleId);
	
	/**
	 * 根据父节点以及角色id集合查询子节点
	 * @param parentId
	 * @param roleId
	 * @return
	 */
	public List<Menu> findByParentIdAndRoleId(int parentId,int roleId);
	
	/**
	 * 根据父节点查找所有子节点
	 * @param parentId
	 * @return
	 */
	public List<Menu> findByParentId(int parentId);
}