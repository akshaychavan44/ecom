package com.E_commerce.e_commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_commerce.e_commerce.model.Product;
import com.E_commerce.e_commerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getall(){
		return repository.findAll();
	}
	
	public Product add(Product product) {
		return repository.save(product);
	}

}
