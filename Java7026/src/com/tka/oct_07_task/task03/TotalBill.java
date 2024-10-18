package com.tka.oct_07_task.task03;

public class TotalBill {
	static int billToPay = 0;
	void addProduct(int quantity,int cost) {
		billToPay+=quantity*cost;
	}
	void displayTotalBill() {
		System.out.println("Your total bill is: "+billToPay);
	}
}
