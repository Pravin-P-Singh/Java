package Task10_17Oct24_Task03;

public class Clothing extends Product {
	String season;
	
	Clothing(){
		
	}
	Clothing(String productName,double productPrice,String season){
		super(productName,productPrice);
		this.season = season;
	}
	public void calculateDiscount() {
		if(season.equals("summer")) {
			//apply 15% discount
			productPrice = productPrice - (productPrice*0.15);
			System.out.println("You have got 15% discount and the price to be paid is: "+productPrice);
		}
		else if(season.equals("winter")) {
			//apply 20% discount
			productPrice = productPrice - (productPrice*0.2);
			System.out.println("You have got 20% discount and the price to be paid is: "+productPrice);
		} else {
			System.out.println("You have got no discount and the price to be paid is: "+productPrice);
		}
	}
	@Override
	public String toString() {
		return "Clothing [productName=" + productName + ", productPrice=" + productPrice + ", season=" + season + "]";
	}
}
