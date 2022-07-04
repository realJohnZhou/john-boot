package com.john.boot.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author john
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {
    /**
     * business code
     */
    private Integer code;

    public BusinessException() {
        super();
    }

    public BusinessException(Integer code) {
        super();
        this.code = code;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, Throwable e) {
        super(e);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable e) {
        super(message, e);
        this.code = code;
    }
}
