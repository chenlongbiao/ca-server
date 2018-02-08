package com.oa.server.service.impl;

import com.oa.server.dao.SysRoleDao;
import com.oa.server.domain.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈龙飚 on 2018/2/8 0008.
 */
@Service
public class SysRoleService {
    @Autowired
    SysRoleDao sysRoleDao;

    public List<SysRole> findAllRole() {
        return sysRoleDao.findAll();
    }
}
