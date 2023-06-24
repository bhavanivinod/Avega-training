package com.avega.jdbc.dao;

import java.util.List;
import java.util.Optional;

import com.avega.jdbc.model.Product;

public interface ProductDAO {

	List<Product> getAllProducts();
	Optional<Product> getProductByCode(String productCode);
	int addProduct(Product product);
	int updateProduct(Product product);
	
}
