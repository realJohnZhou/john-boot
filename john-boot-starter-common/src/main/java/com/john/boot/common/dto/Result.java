package com.john.boot.common.dto;

import lombok.Data;

/**
 * @author john
 */
@Data
public class Result {
    public static final Integer OK = 1;

    public static final Integer NO = 0;

    private Integer code;

    private Object data;

    private String message;

    private Result() {
    }

    public static Result success(Integer code, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static Result success(Object data) {
        return Result.success(Result.OK, data);
    }

    public static Result success() {
        return Result.success(Result.OK, null);
    }

    public static Result failure(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result failure(String message) {
        return Result.failure(Result.NO, message);
    }

    public static Result failure() {
        return Result.failure(Result.NO, null);
    }
}
