package com.lemon.serviceapi.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-16 09:39:06 创建
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -7830936414034384246L;

    private String username;

    private String password;

    private List<String> authorities;
}
