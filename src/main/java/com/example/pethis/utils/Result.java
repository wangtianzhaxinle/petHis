package com.example.pethis.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回响应数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    /**
     * 状态码： 20000是正常响应
     */
    private Integer code;

    /**
     * 消息提示
     */
    private String message;

    /**
     * 返回的数据
     */
    private Object data;
    /**
     * 返回数据的数量
     */
    private long total;

    public static Result ok() {
        return ok(null, 0);
    }

    public static Result ok(Object data, long total) {
        return ok("操作成功", data, total);
    }

    public static Result ok(String message, Object data, long total) {
        return new Result(20000, message, data, total);
    }

    public static Result error(String message) {
        return build(500, message);
    }

    public static Result build(Integer code, String message) {
        return new Result(code, message, null, 0);
    }

}