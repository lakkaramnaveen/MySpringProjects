package com.cg.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pms.dao.ProductDao;
import com.cg.pms.entity.Product;
import com.cg.pms.exception.ProductException;

@Service
public class ProductServiceImpl implements ProductService {

	   @Autowired
	   ProductDao  productDao;
	   
	@Override
	public List<Product> findAllProducts() {
		
		List<Product> list = productDao.findAll();
		
		return list;
	}

	@Override
	public Product findProductById(int productId) throws ProductException
	{
		
		Product prd = null;
		if( productDao.existsById(productId))
		{
			prd = productDao.findById(productId).get();
		}
		else
		{
			throw new ProductException(productId+ " ID NOT FOUND ");
		}
		return prd;
	}

	@Override
	public Product addProduct(Product product) {
		
		productDao.saveAndFlush(product);
		return product;
	}

	@Override
	public Product deleteProductById(int productId) {
		
		Product  prd =null;
		
		if( productDao.existsById(productId))
		{
			 prd = productDao.findById(productId).get();
			 productDao.deleteById(productId);
		}
		return prd ;
	}

	@Override
	public List<Product> findAllProductsByPrice(double low, double high) {
		
		return productDao.findAllProductByPrice(low, high);
	}

	@Override
	public List<Product> findAllProductsByCharacterName(char ch) {
		System.out.println(" Character = "+ch);
		return productDao.findAllProductByCharacterName(ch);
	}

	
}
