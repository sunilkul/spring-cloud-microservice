package com.product.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.api.output.ProductInfo;

@Service
public class ProductService {

	public List<ProductInfo> getProductInfo() {

		List<ProductInfo> productInfoList = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			ProductInfo p = new ProductInfo();
			p.setProductId(i);
			p.setProductName("Test Product " + i);
			p.setPrice(i * 100.00);
			productInfoList.add(p);

		}

		return productInfoList;

	}

}
