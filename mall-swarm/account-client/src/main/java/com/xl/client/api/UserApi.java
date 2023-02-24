package com.xl.client.api;

import org.springframework.web.bind.annotation.GetMapping;

import com.xl.client.vo.UserInfoVO;

public interface UserApi {

    @GetMapping("user/get")
    UserInfoVO getUser();

}
