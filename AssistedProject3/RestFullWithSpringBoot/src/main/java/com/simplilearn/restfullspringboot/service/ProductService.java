package com.simplilearn.restfullspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.simplilearn.restfullspringboot.entity.ProductEntity;
import com.simplilearn.restfullspringboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}
	
	public ProductEntity getProduct(int id) {
		return productRepository.findById(id).get();
	}
	
	public ProductEntity addProduct(ProductEntity pe) {
		return productRepository.save(pe);
	}
	
	public ProductEntity updateProduct(ProductEntity pe) {
		return productRepository.save(pe);
	}
	
	public ResponseEntity<String> deleteProduct(int id) {
		productRepository.deleteById(id);
		return new ResponseEntity<String>("Record deleted successfully",HttpStatus.OK);
	}

}
