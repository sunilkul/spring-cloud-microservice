package com.product.api.output;

public class ProductInfo {

	private Integer productId;
	private String productName;
	private Double price;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductInfo() {
	}

	public ProductInfo(Integer productId, String productName, Double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

}
