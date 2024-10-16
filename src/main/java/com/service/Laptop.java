package com.service;

public class Laptop {
	String brand;
	String year;
	int price;
	Charger charger;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brand, String year, int price, Charger charger) {
		super();
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.charger = charger;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", year=" + year + ", price=" + price + ", charger=" + charger + "]";
	}
	
	
}