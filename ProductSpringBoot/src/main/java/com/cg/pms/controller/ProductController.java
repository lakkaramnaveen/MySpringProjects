package com.cg.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.entity.Product;
import com.cg.pms.service.ProductService;

@RestController
@CrossOrigin("*") //for resourece sharing
public class ProductController {

	@Autowired
	ProductService  productService;
	

	@GetMapping("product/char/{ch}")
	public ResponseEntity<List<Product>>  findAllProductsByCharacter(@PathVariable("ch") char ch)
	{
	  
		List<Product> list = productService.findAllProductsByCharacterName(ch);
		ResponseEntity<List<Product>>  rt = new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		return rt;
		
	}
	
	
	@GetMapping("product")
	public ResponseEntity<List<Product>>  findAllProducts()
	{
	  
		List<Product> list = productService.findAllProducts();
		ResponseEntity<List<Product>>  rt = new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		return rt;
		
	}
	
	@GetMapping("product/{low}/{high}")
	public ResponseEntity<List<Product>>  findAllProductsByPrice(@PathVariable("low") double low,@PathVariable("high") double high)
	{
	  
		List<Product> list = productService.findAllProductsByPrice(low, high);
		ResponseEntity<List<Product>>  rt = new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		return rt;
		
	}
	@GetMapping("product/{id}")
	public  ResponseEntity<Product>  findProductById(@PathVariable("id") int productId) throws  Exception
	{
		
		Product  product = productService.findProductById(productId);
		ResponseEntity<Product>  rt = null;
		
		if(product!=null)
		{
			rt= new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		else
		{
			rt=new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	
	
	
	@DeleteMapping("product/{id}")
	public  ResponseEntity<Product>  deleteProductById(@PathVariable("id") int productId) throws Exception
	{
		
		Product  product = productService.findProductById(productId);
		ResponseEntity<Product>  rt = null;
		
		if(product!=null)
		{
			product = productService.deleteProductById(productId);
			rt= new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		else
		{
			rt=new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	
	@PostMapping("product")
	public ResponseEntity<Product>  createProduct(@RequestBody Product product)
	{
		   Product prd = productService.addProduct(product);
		   ResponseEntity<Product> rt= new ResponseEntity<Product>(product,HttpStatus.OK);
		   return rt;
	}
	
}
