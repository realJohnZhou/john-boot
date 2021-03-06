package com.john.boot.web.advice;

import com.john.boot.common.dto.Result;
import com.john.boot.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author john
 */
@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

    /**
     * business exception
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result<?> exceptionHandler(BusinessException e) {
        log.error("error: {}", e.getMessage(), e);
        return Result.failure(e.getCode(), e.getMessage());
    }

    /**
     * all exception
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result<?> exceptionHandler(Exception e) {
        log.error("error: {}", e.getMessage(), e);
        return Result.failure(e.getMessage());
    }
}
