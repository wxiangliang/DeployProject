package com.xl.admin.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.xl.client.api.UserApi;

@FeignClient(name = "account-service")
public interface UserClient extends UserApi {}
