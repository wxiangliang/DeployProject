package com.xl.account.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.xl.account.entity.User;
import com.xl.account.service.IUserService;
import com.xl.client.vo.UserInfoVO;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;

    @MockBean
    private IUserService userService;

    @DisplayName("测试用户信息")
    public @Test void getUser() {
        User user = new User();
        user.setAge(80);
        user.setId(1);
        user.setName("martin80");
        when(userService.getById(1)).thenReturn(user);
        UserInfoVO userInfoVO = userController.getUser();
        Assertions.assertEquals(userInfoVO.getUserName(), "martin", "用户名不对");
    }
}