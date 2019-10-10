package com.ustglobal.usttyspringcore.bean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		author.getWriter().write();

	}

}
