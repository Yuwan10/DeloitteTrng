package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
 @Autowired
 private ProductDAO productDAO;
 
 public void setProductDAO(ProductDAO productDAO) {
		this.productDAO= productDAO;
	}

	@Override
	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		this.productDAO.save(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product= new Product();
		product.setProductId(productId);
		this.productDAO.delete(product);
		
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		this.productDAO.save(product);
	}

	@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		return (List<Product>) this.productDAO.findAll(); 
	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Optional<Product> product= this.productDAO.findById(productId);
	if(product.isPresent())
	{
		return product.get();
	}
	else
		return null;
		
	}

	@Override
	public List<Product> searchByPriceRange(int minimum, int maximum) {
		// TODO Auto-generated method stub
		return productDAO.findByPriceBetween(minimum, maximum);
	}

}
