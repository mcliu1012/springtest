package com.mcliu.springtest.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcliu.springtest.web.dao.SysUserMapper;
import com.mcliu.springtest.web.entity.SysUser;
import com.mcliu.springtest.web.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;

	/**
	 * 根据SysUser对象，获取SysUser集合
	 * @param record SysUser对象
	 * @return SysUser集合
	 */
	public List<SysUser> selectByInfo(SysUser record) {
		return sysUserMapper.selectByInfo(record);
	}

}
