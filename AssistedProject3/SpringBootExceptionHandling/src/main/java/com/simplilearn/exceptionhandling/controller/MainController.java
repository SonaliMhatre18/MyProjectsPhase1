package com.simplilearn.exceptionhandling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.exceptionhandling.exception.ProductNotFoundException;

@RestController
@RequestMapping("api/v1/product/")
public class MainController {
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public String getProduct(@PathVariable("id") String id) {
		if(id.contentEquals("0")) {
			throw new ProductNotFoundException();
		}
		return "Product was found";
	}

}
