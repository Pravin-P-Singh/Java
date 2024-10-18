package com.tka.oct_07_task.task03;

public class Product {
	int id;
	String name;
	int quantity;
	int cost;
	Product(int id, String name, int quantity, int cost){
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	void displayProductInformation() {
		System.out.println("Product id: "+id+"\nProduct name: "+name+"\nProduct quantity: "+quantity+"\nProduct cost: "+cost);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
}
