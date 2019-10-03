package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;
/*@ModelAttribute Product pro*/
@Controller
public class ProductController {

	@Autowired
	ProductService prodservice;
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	@RequestMapping(value="/addpage", method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("mypro") Product pro, Map<String, Object> model) { 
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Elec");
		types.add("Grocery");
		types.add("HA");
		model.put("dataitem", types);
		return "AddProduct";
	}
	@RequestMapping(value="/pagesubmit", method=RequestMethod.POST)
	public String addData(@Valid @ModelAttribute("mypro") Product pro, BindingResult result, Map<String, Object> model) {
		if(result.hasErrors()) {
			List<String> types = new ArrayList<String>();
			types.add("SELECT");
			types.add("Elec");
			types.add("Grocery");
			types.add("HA");
			model.put("dataitem", types);
			return "AddProduct";
		}
		else {
			prodservice.addProduct(pro);
			return "home";
		}
	}
	
	@RequestMapping(value="/showall", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = prodservice.showProduct();
		return new ModelAndView("ShowProduct", "data", myList);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}
	@RequestMapping(value="/deletedata", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		prodservice.removeData(prodId);
		return "redirect:/showall";
	}
}
