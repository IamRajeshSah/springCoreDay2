package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Charger;
import com.service.Laptop;

public class SpringMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("cg.xml");
		
		//Bean for Laptop class
		
		Laptop lp = (Laptop)app.getBean("laptop");
		System.out.println(lp);

	}

}
