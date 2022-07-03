package com.john.boot.common.dto;

import lombok.Data;

/**
 * @author john
 */
@Data
public class Result<T> {
    public static final Integer OK = 1;

    public static final Integer NO = -1;

    /**
     * business code
     */
    private Integer code;

    /**
     * data
     */
    private T data;
    /**
     * message
     */
    private String message;

    private Result() {
    }

    /**
     * success
     * @param code business code
     * @param data data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(Integer code, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    /**
     * success
     * @param data data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return Result.success(Result.OK, data);
    }

    /**
     * success
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return Result.success(Result.OK, null);
    }

    /**
     * failure
     * @param code code
     * @param message msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(Integer code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code == null ? Result.NO : code);
        result.setMessage(message);
        return result;
    }

    /**
     * failure
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(String message) {
        return Result.failure(Result.NO, message);
    }

    /**
     * failure
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure() {
        return Result.failure(Result.NO, null);
    }
}
