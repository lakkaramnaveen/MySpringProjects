package com.cg.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pms.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>
{

	  @Query("FROM Product where price between :low and :high")
	  public List<Product>  findAllProductByPrice(@Param("low")double low,@Param("high") double high);
	  
	  @Query("From Product where productName like :ch% ")
	  public List<Product>  findAllProductByCharacterName(@Param("ch") char ch);
	  
	  
	  
}
