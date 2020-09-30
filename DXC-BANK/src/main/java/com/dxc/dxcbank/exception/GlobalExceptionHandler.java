package com.dxc.dxcbank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ServiceProviderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String globalExceptionHandler(ServiceProviderNotFoundException exception) {
	return exception.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(UserIdNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String globalExceptionHandler(UserIdNotFoundException exception) {
	return exception.getMessage();
    }
    
    @ResponseBody
    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String globalExceptionHandler(UsernameNotFoundException exception) {
	return exception.getMessage();
    }

}
