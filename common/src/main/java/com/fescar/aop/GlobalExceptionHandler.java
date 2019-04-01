package com.fescar.aop;


import com.fescar.enums.RspStatusEnum;
import com.fescar.exception.DefaultException;
import com.fescar.response.ObjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author:
 * @Description  全局异常处理
 * @Date Created in 2019/1/9 14:12
 */

@ControllerAdvice(basePackages = "com.sinochem.finance.hsy")
@Slf4j
public class GlobalExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public ObjectResponse exceptionHandler(Exception e){
//        ObjectResponse objectResponse = new ObjectResponse<>();
//        objectResponse.setStatus(RspStatusEnum.FAIL.getCode());
//        objectResponse.setMessage(RspStatusEnum.FAIL.getMessage());
//        return objectResponse;
//    }
//
//    @ExceptionHandler(DefaultException.class)
//    @ResponseBody
//    public ObjectResponse defaultException(DefaultException e){
//        ObjectResponse objectResponse = new ObjectResponse<>();
//        objectResponse.setStatus(RspStatusEnum.FAIL.getCode());
//        objectResponse.setMessage(RspStatusEnum.FAIL.getMessage());
//        return objectResponse;
//    }
}
