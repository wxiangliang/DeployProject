package com.xl.admin.controller;

import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xl.admin.feign.UserClient;
import com.xl.client.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("user/get")
    public UserInfoVO get() {
        log.info("get user info,{}", TraceContext.traceId());
        return userClient.getUser();
    }
}
