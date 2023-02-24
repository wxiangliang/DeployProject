package com.xl.account.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "userconfig")
public class AccountConfig {

    private String name;

    private Integer age;
}
