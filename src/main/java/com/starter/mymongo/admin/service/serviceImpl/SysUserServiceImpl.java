package com.starter.mymongo.admin.service.serviceImpl;

import java.util.List;

import com.starter.mymongo.admin.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.mymongo.admin.model.SysUser;
import com.starter.mymongo.admin.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {

        return sysUserMapper.findAll();
    }
}