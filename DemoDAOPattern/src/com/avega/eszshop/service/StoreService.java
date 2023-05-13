package com.avega.eszshop.service;

import java.util.List;

import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.pojo.Store;

public interface StoreService {
List<Store> findAllStores();
Store findStore(String id);
	List<Product> findAllProducts(String id);
	boolean createStore(Store store);
	boolean removeStore(Store store);
	Store editStore(Store store);
	boolean LoadProductsToStore(String storeId,List<Product> products);
	int sellItem(String storeid,String ProductId,int qty);
	int purchasegoods(String storeid,String productId,int qty);
	
}
