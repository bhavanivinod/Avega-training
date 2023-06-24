package com.avega.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avega.jdbc.model.Product;

public class ProductMapper implements RowMapper<Product>
{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		product.setProductCode(rs.getString(1));
		product.setProductDescription(rs.getString(2));
		product.setUnitPrice(rs.getDouble(3));
		product.setQoh(rs.getInt(4));
		product.setCategory(rs.getString(5));
		return product;
	}

}
