package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Product;
import com.lti.app.service.ProductService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class MyRestController {
	
	@Autowired
	ProductService prodservice;
	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return prodservice.getProducts();
	}
	
	@PostMapping("/products")
	public boolean addProduct(@RequestBody Product product)
	{
		prodservice.addProduct(product);
		return true;
	}
	
	@GetMapping("/products/{prodid}")
	public Product findProduct(@PathVariable(name="prodid") String prodid) 
	{
		return prodservice.searchProductById(prodid);
		
	}
	
	@PutMapping("/products")
	public boolean updateProduct(@RequestBody Product product) {
		return prodservice.updateProduct(product);
		
	}
	
	@DeleteMapping("/products/{prodid}")
	public boolean deleteproduct(@PathVariable(name="prodid") String prodid)
	{
		Product product=prodservice.searchProductById(prodid);
		return prodservice.deleteProduct(product);
	}

}
