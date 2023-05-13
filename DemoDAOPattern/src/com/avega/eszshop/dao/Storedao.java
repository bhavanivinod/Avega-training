package com.avega.eszshop.dao;

import java.util.List;

import com.avega.eszshop.exception.StoreNotFoundException;
import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.pojo.Store;

public interface Storedao {
	List<Store> getAllStores();
	Store getStore(String id) throws StoreNotFoundException;
	List<Product> getProducts(String id);
	boolean addStore(Store store);
	boolean deleteStore(Store store);
	Store updateStore(Store store);
	boolean assingProductsToStore(String storeId,List<Product> products);

}
