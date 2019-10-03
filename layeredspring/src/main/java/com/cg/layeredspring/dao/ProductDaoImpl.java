package com.cg.layeredspring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.layeredspring.dto.Product;
@Repository("productdao ")
public class ProductDaoImpl implements ProductDao{

	List<Product> productList = new ArrayList<Product>();
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productList.add(product);
		return product;
	}

	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productList;
	}

}
