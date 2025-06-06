package com.E_commerce.e_commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_commerce.e_commerce.model.Product;
import com.E_commerce.e_commerce.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping
	public Product add(@RequestBody Product product) {
		return service.add(product);
	}
	
	@GetMapping("/{id}")
	public List<Product> getall(@PathVariable String id){
		return service.getall();
	}
	
}
