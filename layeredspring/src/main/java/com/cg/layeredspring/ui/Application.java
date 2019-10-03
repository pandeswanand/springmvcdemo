package com.cg.layeredspring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.layeredspring.dto.Product;
import com.cg.layeredspring.service.ProductService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		ProductService productservice = (ProductService) app.getBean("productservice");
		
		Product pro = (Product) app.getBean("prod");
		pro.setProdId(1001);
		pro.setProdName("Mobile");
		productservice.addProduct(pro);
		System.out.println(productservice.showProduct());
	}

}
