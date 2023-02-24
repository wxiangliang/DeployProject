package com.xl.account.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xl.account.entity.User;
import com.xl.account.mapper.UserMapper;
import com.xl.account.service.IUserService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author martin
 * @since 2022-12-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
