package com.avega.eszshop.client;

import java.time.LocalDate;

import com.avega.eszshop.pojo.Product;
import com.avega.eszshop.pojo.Store;
import com.avega.eszshop.service.ProductService;
import com.avega.eszshop.service.StoreService;
import com.avega.eszshop.serviceImpl.ProductServiceImpl;
import com.avega.eszshop.serviceImpl.StoreServiceImpl;

public class TestClient {
public static void main(String[] args) {
	
	StoreService storeService=new StoreServiceImpl();
	ProductService productservice=new ProductServiceImpl(); 
	storeService.createStore(new Store("ST001","ABC Store-chromepet","chrompet Tambaram",null));
	if(productservice.createProduct(new Product("PR001","pen",89.60,LocalDate.of(2022, 9, 11),LocalDate.of(2025, 5, 11),123,30))) {
		System.out.println("successfully product added");
	}
	
	System.out.println(productservice.findProduct("PR001"));
	
	storeService.LoadProductsToStore("ST001", productservice.findAllProducts());
	
	System.out.println(storeService.findStore("ST001"));
	
	storeService.sellItem("ST001","PR001",3);
	System.out.println("______After selling 3 pens________________");
	System.out.println(storeService.findStore("ST001"));
	
	storeService.purchasegoods("ST001","PR001",67);
	System.out.println("______After purchase_____");
			System.out.println(storeService.findStore("ST001"));}
}
