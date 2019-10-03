package com.cg.layeredspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.layeredspring.dao.ProductDao;
import com.cg.layeredspring.dto.Product;
@Service("productservice")
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productdao;
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.addProduct(product);
	}

	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productdao.showProduct();
	}

}
