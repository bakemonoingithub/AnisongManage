package org.example.anisonmanage.exception;

import org.example.anisonmanage.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(jakarta.validation.ConstraintViolationException.class)
    public Result handParamValidationException(Exception e){
        e.printStackTrace();
        return Result.error(e.getMessage());
    }
    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    public Result handMethodValidationException(Exception e){
        e.printStackTrace();
        return Result.error("传入的参数不正确，详细信息：{%s}".formatted(e.getMessage()));
    }
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        e.printStackTrace();
        return Result.error(e.getMessage());
    }
}
