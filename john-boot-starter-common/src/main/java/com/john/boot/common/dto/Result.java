package com.john.boot.common.dto;

import lombok.Data;

/**
 * @author john
 */
@Data
public class Result<T> {
    public static final Integer OK = 1;

    public static final Integer NO = 0;

    private Integer code;

    private T data;

    private String message;

    private Result() {
    }

    public static <T> Result<T> success(Integer code, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success(T data) {
        return Result.success(Result.OK, data);
    }

    public static <T> Result<T> success() {
        return Result.success(Result.OK, null);
    }

    public static <T> Result<T> failure(Integer code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code == null ? Result.NO : code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> failure(String message) {
        return Result.failure(Result.NO, message);
    }

    public static <T> Result<T> failure() {
        return Result.failure(Result.NO, null);
    }
}
