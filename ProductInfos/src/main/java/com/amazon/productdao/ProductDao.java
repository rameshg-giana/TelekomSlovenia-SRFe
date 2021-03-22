package com.amazon.productdao;

import java.util.Map;

import com.amazon.productdto.ProductDto;

public interface ProductDao {
	Map getProductById(String productId);

}
