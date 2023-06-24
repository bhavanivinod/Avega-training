package com.avega.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.avega.jdbc.model.Product;
import com.avega.jdbc.service.ProductService;
import com.avega.jdbc.serviceimpl.ProductServiceImpl;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctn=SpringApplication.run(JdbcDemoApplication.class, args);
ProductService service=(ProductService) ctn.getBean(ProductServiceImpl.class);
		
		List<Product> products=service.findAllProducts();
		products.forEach(System.out::println);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>product by code<<<<<<<<<<<<<<<<<<<<<<");
		if(service.findProductByCode("PR2354").isPresent())
		{
			System.out.println(service.findProductByCode("PR2354").get());
		}
		
		/*
		 * Product pr=new Product("PRss01","Preeti Mixie",10000,124,"CT02");
		 * System.out.println(service.createProduct(pr));
		 */
		
		
		/*
		 * Product pr=new Product("PRss01","Preeti Mixie",9500,17,"CT02");
		 * System.out.println(service.editProduct(pr));
		 */
	}

}