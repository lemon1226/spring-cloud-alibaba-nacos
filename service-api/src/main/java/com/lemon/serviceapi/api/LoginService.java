package com.lemon.serviceapi.api;

import com.lemon.serviceapi.vo.ResultVo;
import com.lemon.serviceapi.vo.UserInfo;

public interface LoginService {
    ResultVo<String> login(UserInfo userInfo);
}
