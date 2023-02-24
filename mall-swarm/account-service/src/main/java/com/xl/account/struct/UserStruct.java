package com.xl.account.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.xl.account.entity.User;
import com.xl.client.vo.UserInfoVO;

@Mapper(componentModel = "spring")
public interface UserStruct {

    UserStruct INSTANCE = Mappers.getMapper(UserStruct.class);

    @Mapping(source = "name", target = "userName")
    UserInfoVO usertoDto(User user);
}
