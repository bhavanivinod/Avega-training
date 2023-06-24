package com.avega.jdbc.service;

import java.util.List;
import java.util.Optional;

import com.avega.jdbc.model.Product;

public interface ProductService {

	List<Product> findAllProducts();
	Optional<Product>  findProductByCode(String productCode);
	int createProduct(Product product);
	int editProduct(Product product);
}
