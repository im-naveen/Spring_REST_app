package com.lti.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Product;
import com.lti.app.repository.ProductRepo;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo pRepo;

	@Override
	public void addProduct(Product product) {
		
		pRepo.addProduct(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return pRepo.getProducts();
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return pRepo.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(Product product) {
		
		return pRepo.deleteProduct(product);
	}

	@Override
	public Product searchProductById(String prodid) {
		
		return pRepo.searchProductById(prodid);
	}



	
}
