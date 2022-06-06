package com.product.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.output.ProductInfo;
import com.product.api.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(value = "", produces = { "application/json" })
	public ResponseEntity<List<ProductInfo>> getProductInfo() {

		return new ResponseEntity<>(productService.getProductInfo(), HttpStatus.OK);

	}

}
