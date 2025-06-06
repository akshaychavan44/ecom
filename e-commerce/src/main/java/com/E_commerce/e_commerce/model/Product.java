package com.E_commerce.e_commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//Spring Data or serialization/deserialization libraries require a no-argument constructor to instantiate objects.

//@AllArgsConstructor helps you quickly create objects without writing the constructor yourself.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("products")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	@Id
	private String id;
	private String name;
	private String description;
	private double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
