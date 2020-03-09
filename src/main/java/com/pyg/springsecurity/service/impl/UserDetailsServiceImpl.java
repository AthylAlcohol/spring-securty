package com.pyg.springsecurity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pyg.springsecurity.entity.SysRoleMenu;
import com.pyg.springsecurity.entity.SysUser;
import com.pyg.springsecurity.entity.SysUserRole;
import com.pyg.springsecurity.mapper.SysRoleMenuMapper;
import com.pyg.springsecurity.mapper.SysUserMapper;
import com.pyg.springsecurity.mapper.SysUserRoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Resource
	SysUserMapper userMapper;
	@Resource
	SysUserRoleMapper userRoleMapper;
	@Resource
	SysRoleMenuMapper roleMenuMapper;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		logger.debug("===============用户名："+username);

		SysUser user = userMapper.selectOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getUsername,username));

		if(user == null){
			throw new UsernameNotFoundException("用户[" + username + "]不存在");
		}

		//获取角色
		SysUserRole userRole = userRoleMapper.selectByUserId(user.getId());
		//获取菜单权限

		List<String> menuCodeList = new ArrayList<String>();

		if(userRole != null){
			List<SysRoleMenu> roleMenuList = roleMenuMapper.selectByRoleId(userRole.getRoleId());

			menuCodeList = roleMenuList.stream().map(roleMenu -> roleMenu.getMenuCode()).collect(Collectors.toList());
		}else{
			menuCodeList.add("none_menu");
		}

		return new User(username, user.getPassword(), user.getEnabled(), true, true, user.getAccountNonLocked(), AuthorityUtils.createAuthorityList(menuCodeList.toArray(new String[menuCodeList.size()])));


	}

}
