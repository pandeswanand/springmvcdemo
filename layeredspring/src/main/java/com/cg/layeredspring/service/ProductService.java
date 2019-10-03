package com.cg.layeredspring.service;

import java.util.List;

import com.cg.layeredspring.dto.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public List<Product> showProduct();
}
