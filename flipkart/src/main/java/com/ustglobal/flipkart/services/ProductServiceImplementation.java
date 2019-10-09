package com.ustglobal.flipkart.services;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ustglobal.flipkart.connection.ConnectionEstablish;
import com.ustglobal.flipkart.dto.Product;

public class ProductServiceImplementation implements ProductService {
	ConnectionEstablish connection = new ConnectionEstablish();
	EntityManager manager = null;
	Query query = null;
	List<Product> productList = null;
	Product buyItem = new Product();
	Scanner scan = new Scanner(System.in);
	Pattern pattern = null;
	Matcher matcher = null;

	public List<Product> showProduct() {
		manager = connection.getConnection();
		String sqlQuery = " from Product";
		query = manager.createQuery(sqlQuery);
		productList = query.getResultList();
		return productList;
	}

	public Product buyProduct(int i) {
		manager = connection.getConnection();
		buyItem = manager.find(Product.class, i);
		return buyItem;
	}

	@Override
	public boolean buyProcess(Product product) {
		System.out.println("Product Id : " + product.getProductId());
		System.out.println("Product Name : " + product.getProductName());
		System.out.println("Enter Card Number");
		String cardNumber = scan.nextLine();
		System.out.println("Enter cvv");
		String cvv = scan.nextLine();
		System.out.println("Enter Address");
		String address = scan.nextLine();
		pattern = Pattern.compile("\\d{16}");
		matcher = pattern.matcher(cardNumber);
		boolean firstCondition = matcher.matches();
		pattern = Pattern.compile("\\d{3}");
		matcher = pattern.matcher(cvv);
		boolean secondCondition = matcher.matches();

		if (firstCondition && secondCondition) {
			return true;
		} else {
			return false;
		}

	}

}
