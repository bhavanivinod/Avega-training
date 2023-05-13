package com.avega.eszshop.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.avega.eszshop.dao.Productdao;
import com.avega.eszshop.pojo.Product;

public class ProductDaoImpl implements Productdao{

	ConcurrentHashMap<String,Product> products=new ConcurrentHashMap<>();
	
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList(products.values());
	}

	@Override
	public List<Product> getProductsByname(String name) {
		List<Product> productlist=new ArrayList<>();
		for(Product product:products.values())
		{
			if(product.getDescription().equalsIgnoreCase(name)) {
				productlist.add(product);
			}
			
		}
		return productlist;
	}

	@Override
	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public boolean addProduct(Product product) {
		boolean flag=false;
		products.put(product.getId(),product);
		if(products.get(product.getId())!=null)
			flag=true;
		return flag;
	}

	@Override
	public boolean deleteProduct(Product product) {
		boolean flag=false;
		products.remove(product.getId(),product);
		if(products.get(product.getId())==null)
			flag=true;
		return flag;
		
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product updtaeProduct=products.get(product.getId());
		updtaeProduct.setQty_on_hand(product.getQty_on_hand());
		updtaeProduct.setPrice(product.getPrice());
		updtaeProduct.setReorder_level(product.getReorder_level());
		products.put(product.getId(),updtaeProduct);
		
		return products.get(product.getId());
	}

}
