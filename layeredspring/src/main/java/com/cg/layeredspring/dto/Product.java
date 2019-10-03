package com.cg.layeredspring.dto;

import org.springframework.stereotype.Component;

@Component("prod")
public class Product {

	private int prodId;
	private String prodName;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
}
