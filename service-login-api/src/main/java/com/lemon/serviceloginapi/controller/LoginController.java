package com.lemon.serviceloginapi.controller;

import com.lemon.serviceapi.api.LoginService;
import com.lemon.serviceapi.vo.ResultVo;
import com.lemon.serviceapi.vo.UserInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 登录控制器
 *
 * @author lemon
 * @date 2019-08-16 09:43:06 创建
 */
@RestController
@RequestMapping("loginController")
public class LoginController {

    @Reference
    private LoginService loginService;

    @PostMapping("login")
    public ResultVo<String> login(UserInfo userInfo){
        return loginService.login(userInfo);
    }
}
