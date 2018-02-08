package com.oa.server.dao;

import com.oa.server.domain.Permission;
import com.oa.server.domain.SysRole;

import java.util.List;

/**
 * Created by 陈龙飚 on 18/1/29.
 */
public interface SysRoleDao {

    public List<SysRole> findAll();
    public List<SysRole> findByAdminUserId(int userId);
}
