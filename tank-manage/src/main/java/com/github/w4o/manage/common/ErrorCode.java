package com.github.w4o.manage.common;

import com.github.w4o.core.base.CommonError;
import lombok.Getter;

/**
 * 错误信息枚举
 *
 * @author frank
 */
public enum ErrorCode implements CommonError {

    /**
     * 系统错误
     */
    E1000(1000, "系统错误"),
    /**
     * 数据不存在，不能操作
     */
    E1001(1001, "数据不存在，不能操作"),
    /**
     * 图片格式非法
     */
    E1002(1002, "图片格式非法"),
    /**
     * 验证码错误
     */
    E1003(1003, "验证码错误"),
    /**
     * 未知错误
     */
    E9999(9999, "未知错误"),

    //==> 以下错误码与前端代码对应，无需修改！
    /**
     * 用户没有权限
     */
    E401(401, "用户没有权限"),
    /**
     * 令牌过期
     */
    E402(402, "令牌过期"),

    ;

    @Getter
    private final int code;
    @Getter
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}