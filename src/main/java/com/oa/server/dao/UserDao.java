package com.oa.server.dao;

import com.oa.server.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
