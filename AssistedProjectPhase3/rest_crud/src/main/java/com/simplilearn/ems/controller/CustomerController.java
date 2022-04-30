package com.simplilearn.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@GetMapping("/getbill/{amount}/{discount}")
	public String getTotalBill(@PathVariable double amount,@PathVariable double discount) {
		int total = (int) (amount/discount);
		
		return "Total Bill amount " + total;
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> exceptionHandler() {
		return new ResponseEntity<String>("Some Exception occured ", HttpStatus.BAD_REQUEST);
	}

}
