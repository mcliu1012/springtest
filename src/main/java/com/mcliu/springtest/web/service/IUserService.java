package com.mcliu.springtest.web.service;

import java.util.List;

import com.mcliu.springtest.web.entity.SysUser;

public interface IUserService {
	/**
	 * 根据SysUser对象，获取SysUser集合
	 * @param record SysUser对象
	 * @return SysUser集合
	 */
	List<SysUser> selectByInfo(SysUser record);
}
