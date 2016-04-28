package com.mcliu.springtest.web.dao;

import java.util.List;

import com.mcliu.springtest.web.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> selectByInfo(SysUser record);
}