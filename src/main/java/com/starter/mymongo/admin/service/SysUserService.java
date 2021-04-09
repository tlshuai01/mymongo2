package com.starter.mymongo.admin.service;

import java.util.List;

import com.starter.mymongo.admin.model.SysUser;

public interface SysUserService {

    /**
     * 查找所有用户
     *
     * @return
     */
    List<SysUser> findAll();

}