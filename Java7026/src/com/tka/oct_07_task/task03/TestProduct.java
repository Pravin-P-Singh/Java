package com.tka.oct_07_task.task03;

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product(1,"Shampoo",1,200);
		p1.displayProductInformation();
		Product p2 = new Product(2,"TV",3,12000);
		p2.displayProductInformation();
		Product p3 = new Product(3,"Fridge",1,10000);
		p3.displayProductInformation();
		
		TotalBill totalBill = new TotalBill();
		totalBill.addProduct(p1.quantity,p1.cost);
		totalBill.addProduct(p2.quantity,p2.cost);
		totalBill.addProduct(p3.quantity,p3.cost);
		
		totalBill.displayTotalBill();
//		task 1
		String s = "I am learning at the kiran academy";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
		
//		task 2
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
//		task 3
		int sum = 0;
		for(int i = 500; i >=300;i--) {
			if(i%5==0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
		for(int i = 500; i >=300;i--) {
			if(i%7==0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
		for(int i = 500; i >=300;i--) {
			if(i%5==0 && i%7==0) {
				sum+=i;
			}
		}
		System.out.println("Sum is "+sum);
	}
}
