package com.ustglobal.flipkart;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.flipkart.dao.ProductDaoImplementation;
import com.ustglobal.flipkart.dto.Product;
import com.ustglobal.flipkart.services.ProductServiceImplementation;

public class FlipkartApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductServiceImplementation productService = new ProductServiceImplementation();
		ProductDaoImplementation productDao = new ProductDaoImplementation();
		List<Product> items = null;
		Product product = new Product();

		System.out.println("WELCOME TO FLIPKART");
		System.out.println();
		System.out.println("Enter your Choice");
		System.out.println("1.Show all the Products");
		System.out.println("2.Buy the Product");
		System.out.println("0.Close");
		System.out.println("*******************************************");
		int choice = Integer.parseInt(scan.nextLine());

		do {
			switch (choice) {
			case 1:
				items = productService.showProduct();
				productDao.displayProduct(items);

				break;
			case 2:
				System.out.println("Enter the id of the product you want buy");
				System.out.println("Product Id : ");
				product = productService.buyProduct(Integer.parseInt(scan.nextLine()));
				boolean buy = productService.buyProcess(product);
				if (buy) {
					System.out.println("Product Bought Successfully");
					System.out.println("*****************************************");
				} else {
					System.out.println("Failed");
					System.out.println("*********************************************");
				}

				break;

			default:
				System.out.println("Invalid Choice !!!");
				break;
			}
			System.out.println("Enter your Choice");
			choice = Integer.parseInt(scan.nextLine());
			System.out.println("***********************************************");
		} while (choice != 0);

	}
}
