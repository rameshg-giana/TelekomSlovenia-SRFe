package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amazon.productdto.ProductDto;
import com.amazon.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	/*@RequestMapping(value = "/productdata", method = RequestMethod.GET)
	public String callProductIdForm(Model model) {

		model.addAttribute("productdto", new ProductDto());

		return "searchproduct";
	}*/

	@GetMapping(value = "/getProduct/")
	public String getProductData(@PathVariable String productId) {

		ProductDto productDto = productService.getProductData(productId);

		return "productDto";
	}

}
