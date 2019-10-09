package com.ustglobal.flipkart.services;

import java.util.List;

import com.ustglobal.flipkart.dto.Product;

public interface ProductService {
	public List<Product> showProduct();

	public Product buyProduct(int i);

	public boolean buyProcess(Product product);

}
