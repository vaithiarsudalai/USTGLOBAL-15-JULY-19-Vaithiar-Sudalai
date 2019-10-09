package com.ustglobal.flipkart.dao;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.flipkart.dto.Product;

public class ProductDaoImplementation implements ProductDao {
	Scanner scan = new Scanner(System.in);

	public int productIdInfo() {
		System.out.println("Enter Product Id :");
		int productIdNumber = Integer.parseInt(scan.nextLine());
		return productIdNumber;
	}

	@Override
	public void displayProduct(List<Product> items) {
		for (Product product : items) {
			System.out.println("Product Id : " + product.getProductId());
			System.out.println("Product Name : " + product.getProductName());
			System.out.println("Product Cost : " + product.getProductCost());
			System.out.println("Product Color : " + product.getProductColor());
			System.out.println("Product Description : " + product.getDescription());
			System.out.println("*****************************************************");
		}

	}

}
