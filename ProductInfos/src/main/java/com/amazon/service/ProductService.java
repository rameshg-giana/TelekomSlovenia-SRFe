package com.amazon.service;

import java.util.Map;

import com.amazon.productdto.ProductDto;


public interface ProductService {
	
	ProductDto  getProductData(String productId);

}
