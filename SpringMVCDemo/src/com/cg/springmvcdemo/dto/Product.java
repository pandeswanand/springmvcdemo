package com.cg.springmvcdemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="product_db")
public class Product {

	@Id
	@Column(name="prod_id")
	@NotNull(message = "Id cant be empty")
	private Integer productId;
	@Column(name="prod_name")
	@NotEmpty(message = "Name cant be empty")
	private String productName;
	@Column(name="prod_price")
	@NotNull(message = "cant be empty")
	private Double productPrice;
	@Column(name="prod_features")
	private String Features;
	@Column(name="prod_type")
	private String type;
	@Column(name="prod_online")
	private String online;
	
	public Product() {
		
	}
	
	public Product(Integer productId, String productName, Double productPrice, String features, String type,
			String online) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		Features = features;
		this.type = type;
		this.online = online;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", Features=" + Features + ", type=" + type + ", online=" + online + "]";
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getFeatures() {
		return Features;
	}
	public void setFeatures(String features) {
		Features = features;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	
	
}
