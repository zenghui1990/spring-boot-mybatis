package com.game.base.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.base.object.ErrorInfo;

@ControllerAdvice
public class GlobalExceptionHandler {
       public static final String DEFAULT_ERROR_VIEW="ERROR";
       
       @ExceptionHandler(value=Exception.class)
       @ResponseBody
       public ErrorInfo<String> returnException(HttpServletRequest req,Exception e)throws Exception{
           ErrorInfo<String>  errorInfo=new ErrorInfo<>();   
           errorInfo.setMessage(e.getMessage());
           errorInfo.setCode(ErrorInfo.ERROR);
           errorInfo.setData("");
           errorInfo.setUrl(req.getRequestURI().toString());
           return errorInfo;
       }
       
}
