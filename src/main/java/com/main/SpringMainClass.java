package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Charger;

public class SpringMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("cg.xml");
		
		Charger cg = (Charger) app.getBean("charger");
		System.out.println(cg);
		System.out.println(cg.hashCode());
		System.out.println("----------------");
		
		Charger cg2 = (Charger) app.getBean("charger");
		System.out.println(cg2);
		System.out.println(cg2.hashCode());
		System.out.println("----------------");
		
		Charger cg3 = (Charger) app.getBean("charger");
		System.out.println(cg3);
		System.out.println(cg3.hashCode());
		System.out.println("----------------");

	}

}
