package com.avega.eszshop.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.avega.eszshop.dao.Storedao;
import com.avega.eszshop.exception.StoreNotFoundException;
import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.pojo.Store;

public class StoreDaoImpl implements Storedao{

	List<Store> stores=new ArrayList<>();
	@Override
	public List<Store> getAllStores() {
		// TODO Auto-generated method stub
		return stores;
	}

	@Override
	public List<Product> getProducts(String id) {
		List<Product> productList = null;
	 for(Store store:stores) {
		 if(store.getStoreId().equalsIgnoreCase(id))
		 {
			 productList=(List<Product>) store.getProducts().values();
			 break;
		 }
	 }
		
		return productList;
	}

	@Override
	public boolean addStore(Store store) {
		// TODO Auto-generated method stub
		return stores.add(store);
	}

	@Override
	public boolean deleteStore(Store store) {
		// TODO Auto-generated method stub
		return stores.remove(store);
	}

	@Override
	public Store updateStore(Store store) {
		Store updatedstore=null;
		for(Store storefromlist:stores)
		{
			if(storefromlist.getStoreId().equalsIgnoreCase(store.getStoreId()))
					{
				storefromlist.setAddress(store.getAddress());
				storefromlist.setProducts(store.getProducts());
				updatedstore=storefromlist;
				break;
				
					}
		}
		
		return updatedstore;
	}

	@Override
	public boolean assingProductsToStore(String id,List<Product> products) {
		boolean flag=false;
		Map<String,Product> productList=new ConcurrentHashMap<String, Product>();
		for(Store storefromlist:stores)
		{
			if(storefromlist.getStoreId().equalsIgnoreCase(id))
					{
				
				for (Product product:products) {
					productList.put(product.getId(),product);
				}
				storefromlist.setProducts(productList);
				flag=true;
				break;
				
					}
					
					}
		return flag;
	}

	@Override
	public Store getStore(String id) throws StoreNotFoundException  {
		Store store=null;
		for(Store storefromlist:stores)
		{
			if(storefromlist.getStoreId().equalsIgnoreCase(id))
			{
				store=storefromlist;
				break;
			}
			
			}
		
		if (store==null) {
			throw new StoreNotFoundException();
		}
					
		
		return store;
	}

}
