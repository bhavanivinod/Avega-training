package com.avega.jdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avega.jdbc.dao.ProductDAO;
import com.avega.jdbc.mapper.ProductMapper;
import com.avega.jdbc.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	JdbcTemplate jdbcTemplate;
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired	
	public ProductDAOImpl(JdbcTemplate jdbcTemplate,NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		this.namedParameterJdbcTemplate=namedParameterJdbcTemplate;
	}
	@Override
	public List<Product> getAllProducts() {
		String SQL="SELECT product_code,prod_desc,price,qty_on_hand,category_code from product ";
	List<Product> products=this.jdbcTemplate.query(SQL, new ProductMapper());

		
		return products;
	}

	@Override
	public Optional<Product> getProductByCode(String productCode) {
		String SQL="SELECT product_code,prod_desc,price,qty_on_hand,category_code from product where product_code=?";
		Product product=this.jdbcTemplate.queryForObject(SQL,new Object[]{productCode},new ProductMapper());

			
		
		return Optional.of(product);
	}
	@Override
	public int addProduct(Product product) {
		String SQL="insert into product(product_code,prod_desc,price,qty_on_hand,category_code ) values(?,?,?,?,?)";
		int result =this.jdbcTemplate.update(SQL, product.getProductCode(),product.getProductDescription(),product.getUnitPrice(),product.getQoh(),product.getCategory());
		return result;
	}
	@Override
	public int updateProduct(Product product) {
		/*
		 * String
		 * SQL="update product set prod_desc=?,price=?,qty_on_hand=?,category_code=? where product_code=?"
		 * ; int result =this.jdbcTemplate.update(SQL,
		 * product.getProductDescription(),product.getUnitPrice(),product.getQoh(),
		 * product.getCategory(),product.getProductCode()); return result;
		 */
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("descr", product.getProductDescription());
		
		params.put("price", new Double(product.getUnitPrice()));
		
		params.put("qoh", new Integer(product.getQoh()));
		
		params.put("category", product.getCategory());
		params.put("id", product.getProductCode());
		
		String SQL="update product set prod_desc=:descr,price=:price,qty_on_hand=:qoh,category_code=:category where product_code=:id";
		
		
		
		int result =this.namedParameterJdbcTemplate.update(SQL, params);
		return result;
		
		
	}
}