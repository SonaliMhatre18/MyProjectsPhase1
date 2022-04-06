package com.simplilearn.restfullspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.restfullspringboot.entity.ProductEntity;
import com.simplilearn.restfullspringboot.service.ProductService;

@RestController
@RequestMapping("/webapi/product/")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getAll")
	public List<ProductEntity> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping("/get/{id}")
	public ProductEntity getProductById(@PathVariable int id) {
		return productService.getProduct(id);
	}
	
	@PostMapping("/add")
	public ProductEntity addProduct(@RequestBody ProductEntity pe) {
		return productService.addProduct(pe);
	}
	
	@PutMapping("/put")
	public ProductEntity updateProduct(@RequestBody ProductEntity pe) {
		return productService.updateProduct(pe);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id){
		return productService.deleteProduct(id);
	}

}
