package com.jnh.hrGoodsSystem.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	 public void defaultErrorHandler(){
        System.out.println("-------------default error");
    }

}