package com.cardspaly.web.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.cardspaly.web.entity.Menu;
import com.cardspaly.web.entity.Role;
import com.cardspaly.web.entity.User;
import com.cardspaly.web.repository.MenuRepository;
import com.cardspaly.web.repository.RoleRepository;
import com.cardspaly.web.repository.UserRepository;

/**
 * @Project: cardspaly
 * @Description 自定义Realm
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

public class MyRealm extends AuthorizingRealm{

	@Resource
	private UserRepository userRepository;
	
	@Resource
	private RoleRepository roleRepository;
	
	@Resource
	private MenuRepository menuRepository;
	
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName=(String) SecurityUtils.getSubject().getPrincipal();
		User user=userRepository.findByUserName(userName);
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		List<Role> roleList=roleRepository.findByUserId(user.getId());
		Set<String> roles=new HashSet<String>();
		for(Role role:roleList){
			roles.add(role.getName());
			List<Menu> menuList=menuRepository.findByRoleId(role.getId());
			for(Menu menu:menuList){
				info.addStringPermission(menu.getName()); // 添加权限
			}
		}
		info.setRoles(roles);
		return info;
	}

	/**
	 * 权限认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
		User user=userRepository.findByUserName(userName);
		if(user!=null){
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"xxx");
			return authcInfo;
		}else{
			return null;				
		}
	}

}
