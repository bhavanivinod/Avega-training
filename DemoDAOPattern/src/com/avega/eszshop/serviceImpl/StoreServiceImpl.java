package com.avega.eszshop.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import com.avega.eszshop.dao.Productdao;
import com.avega.eszshop.dao.Storedao;
import com.avega.eszshop.daoImpl.ProductDaoImpl;
import com.avega.eszshop.daoImpl.StoreDaoImpl;
import com.avega.eszshop.exception.StoreNotFoundException;
import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.pojo.Store;
import com.avega.eszshop.service.ProductService;
import com.avega.eszshop.service.StoreService;

public class StoreServiceImpl implements StoreService {
	Logger logger=Logger.getLogger(this.getClass().getName());
Storedao storedao=null;
//ProductService productService=null;

public StoreServiceImpl()
{
	this.storedao=new StoreDaoImpl();
	//this.productService=new ProductServiceImpl();
}
	@Override
	public List<Store> findAllStores() {
		// TODO Auto-generated method stub
		return storedao.getAllStores();
	}

	@Override
	public List<Product> findAllProducts(String id) {
		// TODO Auto-generated method stub
		return storedao.getProducts(id);
	}

	@Override
	public boolean createStore(Store store) {
		// TODO Auto-generated method stub
		return storedao.addStore(store);
	}

	@Override
	public boolean removeStore(Store store) {
		// TODO Auto-generated method stub
		return storedao.deleteStore(store);
	}

	@Override
	public Store editStore(Store store) {
		// TODO Auto-generated method stub
		return storedao.updateStore(store);
	}

	@Override
	public boolean LoadProductsToStore(String storeId, List<Product> products) {
		// TODO Auto-generated method stub
		return storedao.assingProductsToStore(storeId, products);
	}

	@Override
	public int sellItem(String storeid,String productId,int qty) {
		Product updatedProduct=null;
		int count=0;
		logger.info("Product id"+productId);
		Store store=findStore(storeid);
		Product product=store.getProducts().get(productId);
		logger.info("Product obj"+product);
		if(product!=null)
		{
		product.setQty_on_hand(product.getQty_on_hand()-qty);
		editStore(store);
		count=product.getQty_on_hand();
		}
		return count;
	}

	@Override
	public int purchasegoods(String storeid, String productId, int qty) {
		Product updatedProduct=null;
		int count=0;
		logger.info("Product id"+productId);
		Store store=findStore(storeid);
		Product product=store.getProducts().get(productId);
		logger.info("Product obj"+product);
		if(product!=null)
		{
		product.setQty_on_hand(product.getQty_on_hand()+qty);
		editStore(store);
		count=product.getQty_on_hand();
		}
		return count;
	}
	@Override
	public Store findStore(String id) {
		Store store=null;
		try {
			 store=storedao.getStore(id);
		} catch (StoreNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return store;
	}

}
