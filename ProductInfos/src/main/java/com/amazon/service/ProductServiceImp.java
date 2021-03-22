package com.amazon.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.productdao.ProductDao;
import com.amazon.productdto.ProductDto;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductDao productDao;

	public ProductDto getProductData(final String productId) {

		Map<String, Object> productDetailsMap = productDao.getProductById(productId);

		for (Map.Entry<String, Object> productData : productDetailsMap.entrySet()) {

			ProductDto productDto = (ProductDto) productData.getValue();

		}

		return new ProductDto();
	}

}
