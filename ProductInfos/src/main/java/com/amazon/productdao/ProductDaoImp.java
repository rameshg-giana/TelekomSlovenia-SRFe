package com.amazon.productdao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImp implements ProductDao {
	
        @Autowired(required = false)
	   private JdbcTemplate jdbcTemplate;

	public Map getProductById(final String productId) {

		Map<String, Object> productDetailsMap = jdbcTemplate.queryForMap("select * from  productdetailes where prodectid=" + productId);
		
		return productDetailsMap;
	}

}
