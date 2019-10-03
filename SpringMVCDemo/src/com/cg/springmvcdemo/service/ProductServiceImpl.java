package com.cg.springmvcdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;
@Service("prodservice")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao proddao;
	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return proddao.save(prod);
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return proddao.findAll();
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return proddao.findByProductId(productId);
	}

	@Override
	public void removeData(int prodId) {
		proddao.remove(prodId);
	}

}
