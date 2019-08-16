package com.lemon.serviceloginprovider.service;

import com.lemon.serviceapi.api.LoginService;
import com.lemon.serviceapi.util.ResultUtil;
import com.lemon.serviceapi.vo.ResultVo;
import com.lemon.serviceapi.vo.UserInfo;
import org.apache.dubbo.config.annotation.Service;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-16 09:54:06 创建
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public ResultVo<String> login(UserInfo userInfo) {
        if("admin".equals(userInfo.getUsername()) && "admin".equals(userInfo.getPassword())){
            return ResultUtil.success(null);
        }
        if("lemon".equals(userInfo.getUsername()) && "lemon".equals(userInfo.getPassword())){
            return ResultUtil.success(null);
        }
        return ResultUtil.busFailed("登录失败");
    }
}
