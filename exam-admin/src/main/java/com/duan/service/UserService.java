package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.dto.AddUserDto;
import com.duan.dto.LoginDto;
import com.duan.dto.RegisterDto;
import com.duan.dto.UpdateUserInfoDto;
import com.duan.entity.User;
import com.duan.vo.PageResponse;
import com.duan.vo.UserInfoVo;

import java.util.List;

/**
 * @author by wzz
 * @implNote 2020/10/20 9:04
 */
public interface UserService extends IService<User> {

    String register(RegisterDto registerDto);

    Boolean checkUsername(String username);

    String login(LoginDto loginDto);

    User getUserByUsername(String username);

    // 这里要reset cache 所以必须要有更新后的数据返回
    User updateUserInfo(UpdateUserInfoDto updateUserInfoDto);

    PageResponse<UserInfoVo> getUser(String loginName, String trueName, Integer pageNo, Integer pageSize);

    void handlerUser(Integer type, String userIds);

    void addUser(AddUserDto addUserDto);

    UserInfoVo getUserInfoById(Integer userId);

    List<UserInfoVo> getUserInfoByIds(List<Integer> userIds);
}
