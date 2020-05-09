package com.cg.pms.service;

import java.util.List;

import com.cg.pms.entity.Product;
import com.cg.pms.exception.ProductException;

public interface ProductService {

	public  List<Product>   findAllProducts();
	public  Product   findProductById(int productId) throws ProductException ;
	public  Product  addProduct(Product product);
	public  Product  deleteProductById(int productId);
	public List<Product>  findAllProductsByPrice(double low,double high);
	public List<Product>  findAllProductsByCharacterName(char ch);
}
