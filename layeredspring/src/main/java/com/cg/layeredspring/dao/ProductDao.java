package com.cg.layeredspring.dao;

import java.util.List;

import com.cg.layeredspring.dto.Product;

public interface ProductDao {

	public Product addProduct(Product product);
	public List<Product> showProduct();
}
