package com.lemon.serviceapi.util;

import com.lemon.serviceapi.vo.ResultVo;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-16 10:06:06 创建
 */
public class ResultUtil {

    public static ResultVo success(Object re){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setRe(re);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo busFailed(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(-1);
        resultVo.setMsg(msg);
        return resultVo;
    }

    public static ResultVo failed(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(-2);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
