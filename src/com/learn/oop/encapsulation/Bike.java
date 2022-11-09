package com.learn.oop.encapsulation;

public class Bike {

	private String name;
	private Integer CC;
	private String color;
	private Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCC() {
		return CC;
	}
	public void setCC(Integer cC) {
		CC = cC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
