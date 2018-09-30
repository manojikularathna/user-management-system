package org.army.common.ums.api;

import org.army.base.common.to.BaseResponse;
import org.army.common.ums.to.LoginRequest;
import org.army.common.ums.to.LoginResponse;
import org.army.common.ums.to.UserTO;

import java.util.List;

public interface UserService {

    List<UserTO> getUsers();

    BaseResponse addUser(UserTO user);

    BaseResponse updateUser(UserTO user);

    LoginResponse login(LoginRequest loginRequest);

}
