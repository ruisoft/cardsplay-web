package com.cardspaly.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cardspaly.web.entity.RoleMenu;
import com.cardspaly.web.repository.RoleMenuRepository;
import com.cardspaly.web.service.RoleMenuService;

/**
 * @Project: cardspaly
 * @Description 角色权限菜单关联Service实现类
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

@Service("roleMenuService")
@Transactional
public class RoleMenuServiceImpl implements RoleMenuService{

	@Resource
	private RoleMenuRepository roleMenuRepository;

	@Override
	public void deleteByRoleId(Integer roleId) {
		roleMenuRepository.deleteByRoleId(roleId);
	}

	@Override
	public void save(RoleMenu roleMenu) {
		roleMenuRepository.save(roleMenu);
	}
	
	
}
