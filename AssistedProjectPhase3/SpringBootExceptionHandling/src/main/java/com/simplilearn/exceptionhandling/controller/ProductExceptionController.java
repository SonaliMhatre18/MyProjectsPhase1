package com.simplilearn.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.simplilearn.exceptionhandling.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionController {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleException() {
		return new ResponseEntity<String>("Sorry some Exception occur at application level",HttpStatus.NOT_FOUND);
	}

}
