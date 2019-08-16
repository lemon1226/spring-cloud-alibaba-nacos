package com.lemon.serviceapi.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-16 10:04:06 创建
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = -572760219061994396L;

    private Integer code;

    private String msg;

    private T re;
}
