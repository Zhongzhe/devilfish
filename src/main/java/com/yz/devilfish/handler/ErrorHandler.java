package com.yz.devilfish.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kyuan on 2017/7/13.
 */

@ControllerAdvice(basePackages = "com.yz.devilfish.web")
public class ErrorHandler {

    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseBody
    public ResponseEntity handleControllerException(HttpServletRequest request,Throwable ex){
        Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");

        return new ResponseEntity(HttpStatus.valueOf(statusCode));
    }

}
