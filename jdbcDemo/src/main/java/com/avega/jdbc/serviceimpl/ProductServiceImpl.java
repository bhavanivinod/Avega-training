package com.avega.jdbc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avega.jdbc.dao.ProductDAO;
import com.avega.jdbc.model.Product;
import com.avega.jdbc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;
	
	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		this.productDAO=productDAO;
	}
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts();
	}
	
	@Override
	public Optional<Product> findProductByCode(String productCode) {
		// TODO Auto-generated method stub
		return productDAO.getProductByCode(productCode);
	}

	@Override
	public int createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	@Override
	public int editProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(product);
	}


}
