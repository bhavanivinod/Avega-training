package com.avega.eszshop.dao;

import java.util.List;

import com.avega.eszshop.pojo.Product;



public interface Productdao {
	
	List<Product> getAllProducts();
	List<Product> getProductsByname(String name);
	Product getProduct(String id);
	boolean addProduct(Product product);
	boolean deleteProduct(Product product);
	Product updateProduct(Product product);
	
	//List<Product> sortProductsBycourse();
	//List<Product> sortProductsByName();

}
