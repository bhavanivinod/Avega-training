package com.avega.eszshop.service;

import java.util.List;

import com.avega.eszshop.pojo.Product;

public interface ProductService {
	List<Product> findAllProducts();
	List<Product> findProductsByname(String name);
	Product findProduct(String id);
	boolean createProduct(Product product);
	boolean removeProduct(Product product);
	Product editProduct(Product product);
	
}
