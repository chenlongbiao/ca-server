package com.oa.server.service.impl;

import com.oa.server.dao.PermissionDao;
import com.oa.server.domain.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionDao permissionDao;


    public List<Permission>  findAllPermission() {
        return permissionDao.findAll();
    }

    public List<Permission> findByAdminUserId(int userId) {
        return permissionDao.findByAdminUserId(userId);
    }
}
