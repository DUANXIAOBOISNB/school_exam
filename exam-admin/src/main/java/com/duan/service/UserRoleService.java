package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.entity.UserRole;

import java.util.List;

/**
 * @author by wzz
 * @implNote 2020/10/20 19:49
 */
public interface UserRoleService extends IService<UserRole> {

    String getMenuInfo(Integer roleId);

    List<UserRole> getUserRole();
}
