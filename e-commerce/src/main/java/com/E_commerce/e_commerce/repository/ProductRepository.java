package com.E_commerce.e_commerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.E_commerce.e_commerce.model.Product;

public interface ProductRepository extends MongoRepository <Product, String> {

}
