package Task10_17Oct24_Task03;

public class Product {
	String productName;
	double productPrice;
	
	Product(){
		
	}
	Product(String productName, double productPrice){
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void displayProduct() {
		System.out.println("Product Name: "+productName+"\nProduct Price: "+productPrice);
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
}
