package com.ustglobal.flipkart.dao;

import java.util.List;

import com.ustglobal.flipkart.dto.Product;

public interface ProductDao {
	public int productIdInfo();

	public void displayProduct(List<Product> items);

}
