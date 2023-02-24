package com.xl.account.controller;

import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.xl.account.config.AccountConfig;
import com.xl.account.entity.User;
import com.xl.account.service.IUserService;
import com.xl.account.struct.UserStruct;
import com.xl.client.api.UserApi;
import com.xl.client.vo.UserInfoVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class UserController implements UserApi {

    @Autowired
    private AccountConfig config;

    @Autowired
    private IUserService userService;

    @Autowired
    private UserStruct userStruct;

    public UserInfoVO getUser() {
        log.info("get user info........{}", TraceContext.traceId());
        User user = userService.getById(1);
        return userStruct.usertoDto(user);
    }
}
