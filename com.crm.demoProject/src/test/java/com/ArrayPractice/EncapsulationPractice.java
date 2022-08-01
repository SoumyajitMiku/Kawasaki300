package com.ArrayPractice;

public class EncapsulationPractice {
	
	private String color;
	private String brand;
	private int price;
	
	public EncapsulationPractice(String color, String brand, int price)
	{
	this.color = color;
	this.brand = brand;
	this.price = price;
	}
	
	
	public void write()
	{
		System.out.println("color is:" + color);
	}
	
	public String getColor()
	{
		return color;
	}

}
