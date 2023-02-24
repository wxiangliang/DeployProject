package com.xl.account.struct;

import com.xl.account.entity.User;
import com.xl.client.vo.UserInfoVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-03T11:48:03+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class UserStructImpl implements UserStruct {

    @Override
    public UserInfoVO usertoDto(User user) {
        if ( user == null ) {
            return null;
        }

        String userName = null;
        int age = 0;

        userName = user.getName();
        if ( user.getAge() != null ) {
            age = user.getAge();
        }

        UserInfoVO userInfoVO = new UserInfoVO( userName, age );

        return userInfoVO;
    }
}
