package com.avega.eszshop.serviceImpl;

import java.util.List;

import com.avega.eszshop.dao.Productdao;
import com.avega.eszshop.daoImpl.ProductDaoImpl;
import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.service.ProductService;

public class ProductServiceImpl implements ProductService{

	Productdao dao=null;
	
	public ProductServiceImpl() {
		this.dao=new ProductDaoImpl();
	}
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public List<Product> findProductsByname(String name) {
		// TODO Auto-generated method stub
		return dao.getProductsByname(name);
	}

	@Override
	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public boolean removeProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(product);
	}

	@Override
	public Product editProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

}
